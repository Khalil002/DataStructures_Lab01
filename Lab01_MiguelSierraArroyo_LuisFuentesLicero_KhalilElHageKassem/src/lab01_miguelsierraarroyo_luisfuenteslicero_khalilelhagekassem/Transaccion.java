/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_miguelsierraarroyo_luisfuenteslicero_khalilelhagekassem;

/**
 *
 * @author khali
 */
public class Transaccion extends Nodo {
    private static int idgen =0;
    private int id;
    private int u1ID;
    private int u2ID;
    private Estado estadoAntes;
    private Estado estadoDespues;
    private float dineroTransmitido;
    
    public Transaccion(Usuario u1, Usuario u2, float dinero) {
        super("Transaccion "+idgen);
        this.id = idgen;
        this.u1ID = u1.getId();
        this.u2ID = u2.getId();
        estadoAntes = new Estado(u1.getBalance(), u2.getBalance());
        u1.setBalance(u1.getBalance()-dinero);
        u2.setBalance(u2.getBalance()+dinero);
        estadoDespues = new Estado(u1.getBalance(), u2.getBalance());
        dineroTransmitido = dinero;
        
        idgen++;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "id=" + id + ", u1ID=" + u1ID + ", u2ID=" + u2ID
                + ", estadoAntes=" + estadoAntes.toString() + ", estadoDespues=" 
                + estadoDespues.toString() + ", dineroTransmitido=" 
                + dineroTransmitido + '}';
    }

    
    public int getu1ID(){
        return u1ID;
    }
    
    public int getu2ID(){
        return u2ID;
    }

    public int getId() {
        return id;
    }

    public Estado getEstadoAntes() {
        return estadoAntes;
    }

    public Estado getEstadoDespues() {
        return estadoDespues;
    }
    
    public float getDineroTransmitido(){
        return dineroTransmitido;
    }
}
