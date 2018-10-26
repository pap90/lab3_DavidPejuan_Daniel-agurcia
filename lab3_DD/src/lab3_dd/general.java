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
public class general extends soldado {

    private int años;

    public general() {
    }

    public general(int años) {
        this.años = años;
    }

    public general(int años, String nombre, String lugar, int edad) {
        super(nombre, lugar, edad);
        this.años = años;
    }

    
    

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    @Override
    public String toString() {
        return "general{" + "a\u00f1os=" + años + '}';
    }
    
}
