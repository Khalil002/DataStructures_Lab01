/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_miguelsierraarroyo_luisfuenteslicero_khalilelhagekassem;

import static java.nio.charset.StandardCharsets.UTF_8;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author khali
 */
public class Bloque extends Nodo {

    private String hash;
    private String hashAnterior;
    private ArrayList<Transaccion> transacciones = new ArrayList();
    private long tiempodeCreacion;
    private int nonce;
    private static int idgen = 0;
    private int id;
    private Bloque bloqueSiguiente;

    public Bloque(String hashAnterior) {
        super(String.valueOf("Bloque " + idgen));
        this.id = idgen;
        nonce = (int)Math.random();
        idgen++;
    }

    public String getHash() {
        return hash;
    }
    public String getHashAnterior() {
        return hashAnterior;
    }
    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }
    public long getTiempodeCreacion() {
        return tiempodeCreacion;
    }
    public Bloque getBloqueSiguiente(){
        return bloqueSiguiente;
    }
    
    public boolean addTransaccion(Transaccion t){
        if (transacciones.size()<3){
            transacciones.add(t);
            return false;
        } else {
            setBloqueSiguiente(new Bloque(this.hash));
            this.bloqueSiguiente.addTransaccion(t);
            return true;
        }
    }
    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
    public void setBloqueSiguiente(Bloque bloqueSiguiente){
        this.bloqueSiguiente = bloqueSiguiente;
    }
    
    public String calculateBlockHash() {
        String datosAHash = hashAnterior
                + Long.toString(tiempodeCreacion)
                + Integer.toString(nonce)
                + transacciones.toString();
        MessageDigest digerir = null;
        byte[] bytes = null;
        try {
            digerir = MessageDigest.getInstance("SHA-256");
            bytes = digerir.digest(datosAHash.getBytes(UTF_8));
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(":(");
        }
        StringBuffer buffer = new StringBuffer();
        for (byte b : bytes) {
            buffer.append(String.format("%02x", b));
        }
        return buffer.toString();
    }
}
