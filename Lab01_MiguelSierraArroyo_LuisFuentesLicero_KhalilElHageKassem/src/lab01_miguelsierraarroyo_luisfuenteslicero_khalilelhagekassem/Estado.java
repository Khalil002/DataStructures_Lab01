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
public class Estado extends Nodo{
    private final float b1;
    private final float b2;
    
    public Estado(float b1, float b2) {
        super("Antes");
        this.b1 = b1;
        this.b2 = b2;
    }

    public float getB1() {
        return b1;
    }
    public float getB2() {
        return b2;
    }

    @Override
    public String toString() {
        return "Estado{" + "b1=" + b1 + ", b2=" + b2 + '}';
    }
    
    public String getData(){
        return b1 + "," + b2;
    }
    
    
}
