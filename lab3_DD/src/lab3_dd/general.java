/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_dd;

/**
 *
 * @author david
 */
public class general extends soldado{
    private int años;
    private String mando;

    public general() {
    }

    public general(int años, String mando, String nombre, String lugar, int edad, int salud, Arma arma) {
        super(nombre, lugar, edad, salud, arma);
        this.años = años;
        this.mando = mando;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getMando() {
        return mando;
    }

    public void setMando(String mando) {
        this.mando = mando;
    }

    @Override
    public String toString() {
        return "general{" + "a\u00f1os=" + años + ", mando=" + mando + '}';
    }
    
    
}
