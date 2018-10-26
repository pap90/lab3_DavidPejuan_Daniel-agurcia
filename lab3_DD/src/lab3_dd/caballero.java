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
public class caballero extends soldado{

    public caballero() {
    }

    public caballero(String nombre, String lugar, int edad, int salud, Arma arma) {
        super(nombre, lugar, edad, salud, arma);
    }

    @Override
    public String toString() {
        return "caballero{" + '}';
    }
    
}
