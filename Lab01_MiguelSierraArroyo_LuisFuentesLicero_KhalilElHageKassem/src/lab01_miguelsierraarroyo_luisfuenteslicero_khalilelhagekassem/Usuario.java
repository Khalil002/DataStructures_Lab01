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
public class Usuario extends Nodo {

    private String nombre;
    private String apellido;
    private String email;
    private int numeroIdentificacion;
    private String contraseña;
    private float balance;
    private Usuario izquierda;
    private Usuario derecha;
    private int id;
    private int altura;
    private static int idgen = 0;

    public Usuario(String nombre, String apellido, int numeroIdentificacion, String email, String contraseña, float balance) {
        super(String.valueOf(idgen));
        this.id = idgen;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.email = email;
        this.contraseña = contraseña;
        this.balance = balance;
        idgen++;

    }

    public Usuario(String nombre, String apellido, int numeroIdentificacion, String email, String contraseña, float balance, int id) {
        super(String.valueOf(idgen));
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.email = email;
        this.contraseña = contraseña;
        this.balance = balance;
    }

    public int getNextId() {
        return this.id + 1;
    }
    
    public int getId() {
        return id;
    }

    public Usuario getIzquierda() {
        return izquierda;
    }

    public Usuario getDerecha() {
        return derecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getBalance() {
        return balance;
    }

    public int getAltura() {
        return altura;
    }

    public String getEmail() {
        return email;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public static int getIdgen() {
        return idgen;
    }

    public void setIzquierda(Usuario izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Usuario derecha) {
        this.derecha = derecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public static void setIdgen(int idgen) {
        Usuario.idgen = idgen;
    }

    

    public void copyData(Usuario temp) {
        this.id = temp.id;
        this.nombre = temp.nombre;
        this.apellido = temp.apellido;
        this.numeroIdentificacion = temp.numeroIdentificacion;
        this.email = temp.email;
        this.contraseña = temp.contraseña;
        this.balance = temp.balance;
    }

    public String getData() {
        return this.nombre + "," + this.apellido + "," + this.numeroIdentificacion + "," + this.email + "," + this.contraseña + "," + this.id + "," + this.balance;
    }
}
