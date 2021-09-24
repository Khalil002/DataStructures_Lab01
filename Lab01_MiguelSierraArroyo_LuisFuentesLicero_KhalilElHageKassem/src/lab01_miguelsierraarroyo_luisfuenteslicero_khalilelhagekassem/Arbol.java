/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_miguelsierraarroyo_luisfuenteslicero_khalilelhagekassem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khali
 */
public class Arbol {

    public Raiz r;

    public Arbol() {
        r = new Raiz("RochiCoin");
        abrirArchivos();
    }

    public Usuario buscarUsuario(int uID) {
        return r.buscarUsuario(uID);
    }

    public void registrarUsuario(Usuario u) {
        r.registrarUsuario(u);
    }

    public void realizarTransaccion(Usuario r1, Usuario r2, float dinero) {
        r.registrarTransaccion(r1, r2, dinero);
    }

    public void eliminarUsuario(int id) {
        r.eliminarUsuario(id);
    }

    public int getTotalNodes() {
        return r.getTotalNodes();
    }

    public void guardarArchivos() {
        File folder = new File("data");
        try {
            folder.mkdir();
        } catch (Exception e) {
            System.out.println("Error en crear el folder");
        }
        File file = new File(folder, "usuarios.csv");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error en crear el archivo");
        }
        try ( FileWriter fw = new FileWriter(file, false)) {
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(r.preOrder());
            bw.flush();
            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println("error");

        }

        File file2 = new File(folder, "transacciones.csv");
        try {
            file2.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error en crear el archivo");
        }
        try ( FileWriter fw = new FileWriter(file2, false)) {
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(r.recorrerBloques());
            bw.flush();
            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println("error");

        }

    }

    

    

    public Raiz getR() {
        return r;
    }

    public void setR(Raiz r) {
        this.r = r;
    }

    public static void createFile(File f, File file) {
        f.mkdir();
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error en crear el archivo");
        }
    }

    public void abrirArchivos() {
        File folder = new File("data");
        if (!folder.exists()) {
            try {
                folder.mkdir();
            } catch (Exception e) {
                System.out.println("Error en crear el folder");
            }
        }

        

        File file = new File(folder, "usuarios.csv");
        if (!file.exists()) {
            try {
                file.createNewFile();
                r.insertarUsuario("master", "admin", 0, "admin@master.com", "master", 0, 1000);
            } catch (IOException ex) {
                System.out.println("Error en crear el archivo de usuario");
            }
        } else {
            try {
                Scanner in = new Scanner(file);
                int i = 0;
                while (in.hasNextLine()) {
                    String linea = in.nextLine();
                    String datos[] = linea.split(",");

                    //archivo id, nombre, apellido, cedula, email, contra, balance;
                    //insertar nombre, apellido, cedula, email, contra, id, balance;
                    r.insertarUsuario(datos[1], datos[2], Integer.parseInt(datos[3]), datos[4], datos[5], Integer.parseInt(datos[0]), Float.parseFloat(datos[6]));

                    i++;
                }
                if (i > r.usuario.getIdgen()) {
                    this.r.usuario.setIdgen(i);
                }

            } catch (Exception ex) {
                System.out.println(ex + "bruh?");
            }
        }
        
        File file1 = new File(folder, "transacciones.csv");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error en crear el archivo transacciones");
            }
        } else {
            try {
                Scanner in = new Scanner(file1);
                int i = 0;
                while (in.hasNextLine()) {
                    String linea = in.nextLine();
                    String datos[] = linea.split(",");
                    Usuario u1 = r.buscarUsuario(Integer.parseInt(datos[1]));
                    Usuario u2 = r.buscarUsuario(Integer.parseInt(datos[2]));
                    System.out.println("a");
                    r.insertarTransaccion(Integer.parseInt(datos[0]),
                            u1,
                            u2,
                            Float.parseFloat(datos[3]));
                    i++;
                }
                if (i / 3 > r.bloque.getIdgen()) {
                    this.r.bloque.setIdgen(i);
                }

            } catch (Exception ex) {
                System.out.println(ex + " error en insertarTransacciones del archivo");
            }
        }

    }

    public int height() {
        return r.height();
    }

}
