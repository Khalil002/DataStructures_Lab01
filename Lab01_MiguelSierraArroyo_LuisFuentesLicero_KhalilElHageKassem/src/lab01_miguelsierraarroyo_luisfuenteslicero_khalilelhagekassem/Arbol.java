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

/**
 *
 * @author khali
 */
public class Arbol {

    public Raiz r;

    public Arbol() {
        r = new Raiz("RochiCoin");
        abrirUsuarios();
    }

    public Usuario buscarUsuario(int uID) {
        return r.buscarUsuario(uID);
    }

    

    public void registrarUsuario(Usuario u) {
        r.registrarUsuario(u);
    }

    public void realizarTransaccion(Usuario r1, Usuario r2, float dinero) {
        r.realizarTransaccion(r1, r2, dinero);
    }

    public void eliminarUsuario(Usuario u) {
        r.eliminarUsuario(u, u.getId());
    }

    public int getTotalNodes() {
        return r.getTotalNodes();
    }

    public void guardarArchivo() {
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

    }

    static void removeLine(String filePath, String lineToRemove) throws IOException {
        File inputFile = new File(filePath);
        File tempFile = new File("C:\\user\\tmpFile.txt");
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter(tempFile));
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            String trimmedLine = currentLine.trim();
            if (trimmedLine.equals(lineToRemove)) {
                continue;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        inputFile.delete();
        tempFile.renameTo(inputFile);
    }

    public static void isOpen(String path) {
        File file = new File(path);

        // try to rename the file with the same name
        File sameFileName = new File(path);

        if (file.renameTo(sameFileName)) {
            // if the file is renamed
            System.out.println("file is closed");
        } else {
            // if the file didnt accept the renaming operation
            System.out.println("file is opened");
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

    public void abrirUsuarios() {
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
                System.out.println("Error en crear el archivo");
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
    }

    public int height() {
        return r.height();
    }

}
