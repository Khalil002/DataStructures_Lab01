/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_miguelsierraarroyo_luisfuenteslicero_khalilelhagekassem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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

    public void buscarUsuario(int uID) {
        r.buscarUsuario(uID);
    }

    public void registrarUsuario(String nombre, String apellido, int numeroIdentificacion, String email, String contraseña) {
        r.registrarUsuario(nombre, apellido, numeroIdentificacion, email, contraseña);
    }

    public void realizarTransaccion(Usuario r1, Usuario r2, float dinero) {
        r.realizarTransaccion(r1, r2, dinero);
    }

    public void guardarArchivo() {
        try (FileWriter fw = new FileWriter("usuarios.csv", true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(r.preOrder());
            bw.newLine();
            bw.flush();
            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println("error");
        }
    }
    
    
    

    public void abrirUsuarios() {
        File f = new File("usuarios.csv");

        try {
            Scanner in = new Scanner(f);
            int i = 0;
            while (in.hasNextLine()) {
                String linea = in.nextLine();
                String datos[] = linea.split(",");
                r.insertarUsuario(datos[0], datos[1], Integer.parseInt(datos[2]), datos[3], datos[4], Integer.parseInt(datos[5]), Float.parseFloat(datos[6]));
                i++;
            }
            if (i > r.usuario.getIdgen()) {
                this.r.usuario.setIdgen(i);
            }

        } catch (Exception ex) {
            System.out.println("error");
        }
    }

}
