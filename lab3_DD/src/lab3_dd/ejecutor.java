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
public class ejecutor extends soldado {

    private Bomba bomba;

    public ejecutor() {
    }

    public ejecutor(Bomba bomba) {
        this.bomba = bomba;
    }

    public ejecutor(String nombre, String lugar, int edad) {
        super(nombre, lugar, edad);
    }

    

    public Bomba getBomba() {
        return bomba;
    }

    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }

    @Override
    public String toString() {
        return "ejecutor{" + "bomba=" + bomba + '}';
    }

}
