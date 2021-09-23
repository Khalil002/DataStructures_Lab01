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
public abstract class Nodo {
    private String texto;
    private int x;
    private int y;

    public Nodo(String texto) {
        this.texto = texto;
    }

    public String getText() {
        return texto;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setS(String s) {
        this.texto = texto;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
