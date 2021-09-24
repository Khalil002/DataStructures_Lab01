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
import java.util.Date;

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
        this.hashAnterior = hashAnterior;
        this.tiempodeCreacion = new Date().getTime();
        //transacciones
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

    public Bloque getBloqueSiguiente() {
        return bloqueSiguiente;
    }

    public void addTransaccion(Transaccion t) {
        if (transacciones.size() < 3) {
            transacciones.add(t);
        } else {
            calculateHash();
            setBloqueSiguiente(new Bloque(this.hash));
            this.bloqueSiguiente.addTransaccion(t);
        }
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public void setBloqueSiguiente(Bloque bloqueSiguiente) {
        this.bloqueSiguiente = bloqueSiguiente;
    }

    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256(
                hashAnterior
                + Long.toString(tiempodeCreacion)
                + Integer.toString(nonce)
                + transacciones
        );
        return calculatedhash;
    }

    

    public static int getIdgen() {
        return idgen;
    }

    public static void setIdgen(int idgen) {
        Bloque.idgen = idgen;
    }

    public void corregirTransacciones(int id) {
        for (Transaccion t : transacciones) {
            t.corregirTransacciones(id);
        }
        if(transacciones.size()==3){
            calculateHash();
        }
    }

    

}
