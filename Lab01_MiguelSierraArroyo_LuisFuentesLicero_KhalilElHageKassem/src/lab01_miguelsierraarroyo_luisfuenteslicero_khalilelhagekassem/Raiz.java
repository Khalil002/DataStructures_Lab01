/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_miguelsierraarroyo_luisfuenteslicero_khalilelhagekassem;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author khali
 */
public class Raiz extends Nodo {

    public Usuario usuario;
    public Bloque bloque;

    public Raiz(String texto) {
        super(texto);
        usuario = new Usuario("Usuario", "Origen", 0, "", "", 1000);
        usuario.guardarArchivoOrigen();
        bloque = new Bloque("0");
        
    }

    public Usuario buscarUsuario(int uID) {
        return buscar(usuario, uID);
    }

    private Usuario buscar(Usuario u, int uID) {
        if (u != null) {
            if (uID == u.getId()) {
                return u;
            } else if (uID > u.getId()) {
                return buscar(u.getDerecha(), uID);
            } else {
                return buscar(u.getIzquierda(), uID);
            }
        }
        return null;
    }

    public String buscarNombre(int uID) {
        File f = new File("usuarios.csv");
        try {
            Scanner in = new Scanner(f);
            while (in.hasNextLine()) {
                String linea = in.nextLine();
                String datos[] = linea.split(",");
                String nombre = datos[0];
                int id = Integer.parseInt(datos[5]);
                if (uID == id) {
                    return nombre;
                }
            }

        } catch (Exception ex) {
            System.out.println("error");
        }
        return null;
    }

    public String buscarApellido(int uID) {
        File f = new File("usuarios.csv");
        try {
            Scanner in = new Scanner(f);
            while (in.hasNextLine()) {
                String linea = in.nextLine();
                String datos[] = linea.split(",");
                String apellido = datos[1];
                int id = Integer.parseInt(datos[5]);
                if (uID == id) {
                    return apellido;
                }
            }

        } catch (Exception ex) {
            System.out.println("error");
        }
        return null;
    }

    public int buscarId(int uID) {
        File f = new File("usuarios.csv");

        try {
            Scanner in = new Scanner(f);
            while (in.hasNextLine()) {
                String linea = in.nextLine();
                String datos[] = linea.split(",");
                int id = Integer.parseInt(datos[5]);
                if (uID == id) {
                    return id;
                }
            }
        } catch (Exception ex) {
            System.out.println("error");
        }
        return 0;
    }

    public float buscarBalance(int uID) {
        File f = new File("usuarios.csv");

        try {
            Scanner in = new Scanner(f);
            while (in.hasNextLine()) {
                String linea = in.nextLine();
                String datos[] = linea.split(",");
                int id = Integer.parseInt(datos[5]);
                float balance = Float.parseFloat(datos[6]);
                if (uID == id) {
                    return balance;
                }
            }

        } catch (Exception ex) {
            System.out.println("error");
        }
        return 0;
    }

    public void registrarUsuario(String nombre, String apellido, int numeroIdentificacion, String email, String contraseña) {
        this.usuario = insertarUsuario(this.usuario, new Usuario(nombre, apellido, numeroIdentificacion, email, contraseña, 500));
    }

    void insertarUsuario(String nombre, String apellido, int numeroIdentificacion, String email, String contraseña, int id, float balance) {
        this.usuario = insertarUsuario(this.usuario, new Usuario(nombre, apellido, numeroIdentificacion, email, contraseña, balance, id));
    }

    public String preOrder() {
        return preOrder(this.usuario);
    }

    private String preOrder(Usuario n) {
        if (n != null) {
            return n.getData() + "\n" + preOrder(n.getIzquierda()) + preOrder(n.getDerecha());
        }
        return "";
    }

    private Usuario insertarUsuario(Usuario u, Usuario m) {
        if (u == null) {
            return m;
        } else if (m.getId() < u.getId()) {
            u.setIzquierda(insertarUsuario(u.getIzquierda(), m));
        } else if (m.getId() > u.getId()) {
            u.setDerecha(insertarUsuario(u.getDerecha(), m));
        } else {
            throw new RuntimeException("duplicate Key!");
        }
        return rebalance(u);
    }

    private void updateHeight(Usuario n) {
        n.setAltura(1 + Math.max(n.getIzquierda().getAltura(), n.getDerecha().getAltura()));

    }

    private int height(Usuario n) {
        return n == null ? -1 : n.getAltura();
    }

    private int getBalance(Usuario n) {
        return n == null ? 0 : n.getDerecha().getAltura() - n.getIzquierda().getAltura();
    }

    private Usuario rotateRight(Usuario y) {
        Usuario x = y.getIzquierda();
        Usuario z = x.getDerecha();
        x.setDerecha(y);
        y.setIzquierda(z);
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private Usuario rotateLeft(Usuario y) {
        Usuario x = y.getDerecha();
        Usuario z = x.getIzquierda();
        x.setIzquierda(z);
        y.setDerecha(y);
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private Usuario rebalance(Usuario z) {
        updateHeight(z);
        int balance = getBalance(z);
        if (balance > 1) {
            if (z.getDerecha().getDerecha().getAltura()
                    > z.getDerecha().getIzquierda().getAltura()) {
                z = rotateLeft(z);
            } else {
                z.setDerecha(rotateRight(z.getDerecha()));
                z = rotateLeft(z);
            }
        } else if (balance < -1) {
            if (z.getIzquierda().getIzquierda().getAltura()
                    > z.getIzquierda().getDerecha().getAltura()) {
                z = rotateRight(z);
            } else {
                z.setIzquierda(rotateLeft(z.getIzquierda()));
                z = rotateRight(z);
            }
        }
        return z;
    }

    public Usuario eliminarUsuario(Usuario u, int id) {
        if (u == null) {
            return u;
        } else if (u.getId() < id) {
            u.setIzquierda(eliminarUsuario(u.getIzquierda(), id));
        } else if (u.getId() > id) {
            u.setDerecha(eliminarUsuario(u.getDerecha(), id));
        } else {
            // node with only one child or no child
            if ((u.getIzquierda() == null) || (u.getDerecha() == null)) {
                u = (u.getIzquierda() == null) ? u.getDerecha() : u.getIzquierda();
            } else {
                Usuario temp = mostLeftChild(u.getDerecha());

                u.copyData(temp);

                u.setDerecha(eliminarUsuario(u.getDerecha(), temp.getId()));
            }

        }
        if (u != null) {
            u = rebalance(u);
        }
        return u;
    }

    Usuario mostLeftChild(Usuario u) {
        if (u.getIzquierda() != null) {
            return mostLeftChild(u.getIzquierda());
        }
        return u;
    }

    Usuario mostRightChild(Usuario u) {
        if (u.getDerecha() != null) {
            return mostLeftChild(u.getDerecha());
        }
        return u;
    }

    public void realizarTransaccion(Usuario r1, Usuario r2, float dinero) {
        transaccion(r1, r2, dinero, bloque);
    }

    private void transaccion(Usuario u1, Usuario u2, float dinero, Bloque bloque) {
        if (verificarTransaccion(u1)) {
            Transaccion t = new Transaccion(u1, u2, dinero);
            Bloque p = bloque;
            Bloque pnext = bloque.getBloqueSiguiente();
            while (pnext != null) {
                p = pnext;
                pnext = p.getBloqueSiguiente();
            }
            p.addTransaccion(t);
        }
    }

    private boolean verificarTransaccion(Usuario u1) {
        Bloque p = bloque;
        float balanceVerif = 0;
        while (p != null) {
            for (Transaccion t : p.getTransacciones()) {
                if (t.getu1ID() == u1.getId()) {
                    balanceVerif = balanceVerif - t.getDineroTransmitido();
                } else if (t.getu2ID() == u1.getId()) {
                    balanceVerif = balanceVerif + t.getDineroTransmitido();
                }
            }
            p = p.getBloqueSiguiente();
        }
        return balanceVerif == u1.getBalance();
    }

}
