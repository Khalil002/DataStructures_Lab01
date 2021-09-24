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
    private int totalNodes = 0;
    private int difficulty;

    public Raiz(String texto) {
        super(texto);
        bloque = new Bloque("0");
        usuario = null;
        this.difficulty=5;
    }
    
    public boolean isChainValid(){
        Bloque b = this.bloque;
        while(b!=null){
            String prevHash = b.getHash();
            b = b.getBloqueSiguiente();
            String currentHash = b.getHashAnterior();
            if(prevHash!=currentHash){
                return false;
            }
            if(b.getHash()!=b.calculateHash()){
                return false;
            }
        }
        return true;
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

    public void registrarUsuario(Usuario u) {
        totalNodes++;
        if (usuario == null) {
            usuario = u;
        } else {
            this.usuario = insertarUsuario(this.usuario, u);
        }

    }

    public void insertarUsuario(String nombre, String apellido, int numeroIdentificacion, String email, String contraseña, int id, float balance) {
        totalNodes++;
        Usuario u = new Usuario(nombre, apellido, numeroIdentificacion, email, contraseña, balance, id);
        if (usuario == null) {
            usuario = u;
        } else {
            this.usuario = insertarUsuario(this.usuario, u);
        }
    }

    public String preOrder() {
        return preOrder(this.usuario);
    }

    public String preOrder(Usuario n) {
        if (n != null) {
            return n.getData() + "\n" + preOrder(n.getIzquierda()) + preOrder(n.getDerecha());
        }
        return "";
    }

    public String recorrerBloques() {
        String text = "";
        Bloque p = bloque;
        while (p != null) {
            for (Transaccion t : p.getTransacciones()) {
                text += t.getData() + "\n";
            }
            p = p.getBloqueSiguiente();
        }
        return text;
    }

    private Usuario insertarUsuario(Usuario u, Usuario m) {
        if (u == null) {
            return m;

        } else if (m.getId() < u.getId()) {
            u.setIzquierda(insertarUsuario(u.getIzquierda(), m));
        } else if (m.getId() > u.getId()) {
            u.setDerecha(insertarUsuario(u.getDerecha(), m));
        } else {
            throw new RuntimeException("duplicate K");
        }
        return rebalance(u);
    }

    private void updateHeight(Usuario n) {
        n.setAltura(1 + Math.max(userHeight(n.getIzquierda()), userHeight(n.getDerecha())));
    }

    private int blockHeight(Bloque b) {
        if (b == null) {
            return 0;
        } else {
            return 1 + blockHeight(b.getBloqueSiguiente());
        }
    }

    private int userHeight(Usuario n) {
        return n == null ? 0 : n.getAltura();
    }

    public int height() {
        return userHeight(usuario);
    }

    private int getBalance(Usuario n) {
        return n == null ? 0 : userHeight(n.getDerecha()) - userHeight(n.getIzquierda());
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
        x.setIzquierda(y);
        y.setDerecha(z);
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private Usuario rebalance(Usuario z) {
        updateHeight(z);
        int balance = getBalance(z);
        if (balance < -1) {
            if (getBalance(z.getIzquierda()) <= 0) {
                z = rotateRight(z);
            } else {
                z.setIzquierda(rotateLeft(z.getIzquierda()));
                z = rotateRight(z);
            }
        } else if (balance > 1) {
            if (getBalance(z.getDerecha()) >= 0) {
                z = rotateLeft(z);
            } else {
                z.setDerecha(rotateRight(z.getDerecha()));
                z = rotateLeft(z);
            }
        }

        return z;
    }

    public void eliminarUsuario(int id) {
        totalNodes--;
        corregirTransacciones(id, this.bloque);
        this.usuario = eliminarUsuario(this.usuario, id);
    }

    private void corregirTransacciones(int id, Bloque b) {
        if (b != null) {
            b.corregirTransacciones(id);
            corregirTransacciones(id, b.getBloqueSiguiente());
        }
    }

    public Usuario eliminarUsuario(Usuario u, int id) {
        if (u == null) {
            return u;
        } else if (u.getId() > id) {
            u.setIzquierda(eliminarUsuario(u.getIzquierda(), id));
        } else if (u.getId() < id) {
            u.setDerecha(eliminarUsuario(u.getDerecha(), id));
        } else {
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

    public void registrarTransaccion(Usuario r1, Usuario r2, float dinero) {
        transaccion(r1, r2, dinero, this.bloque);
        totalNodes++;
    }

    public void insertarTransaccion(int id, Usuario u1, Usuario u2, float dinero) {
        Transaccion t = new Transaccion(u1, u2, dinero, id);
        System.out.println(t.getData()+"\n");
        Bloque p = this.bloque;
        Bloque pnext = this.bloque.getBloqueSiguiente();
        while (pnext != null) {
            p = pnext;
            pnext = p.getBloqueSiguiente();
        }
        p.addTransaccion(t);
    }

    private void transaccion(Usuario u1, Usuario u2, float dinero, Bloque bloque) {
        float verif = verificarTransaccion(u1, bloque);
        if (verif == u1.getBalance() || verif == -1) {
            if (u1.getBalance() >= dinero) {
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
    }

    private float verificarTransaccion(Usuario u1, Bloque bloque) {
        /*si el id es 0 la transaccion viene del master o fue transmitida 
        al master si el usuario origenario de la transaccion fue eliminado*/
        if (u1.getId() == 0) {
            return -1;
        }

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
        return balanceVerif;
    }

    public int getTotalNodes() {
        return totalNodes;
    }
    
    public void nodePositions() {
        totalNodes = 0;
        int depth = 1;
        nodePositions(usuario, depth);
    }
    private void nodePositions(Usuario t, int depth) {
        if (t != null) {
            nodePositions(t.getIzquierda(), depth + 1); //add 1 to depth (y coordinate) 
            t.setX((totalNodes++)); //x coord is node number in inorder traversal
            t.setY(+depth); // mark y coord as depth
            nodePositions(t.getDerecha(), depth + 1);
        }
    }

}
