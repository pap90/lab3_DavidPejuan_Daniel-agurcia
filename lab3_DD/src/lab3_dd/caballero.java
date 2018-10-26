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
public class caballero extends soldado {

    public caballero() {
    }

    public caballero(String nombre, String lugar, int edad) {
        super(nombre, lugar, edad);
    }

    @Override
    public String toString() {
        return "Nombre del General: " + super.getNombre() + "\n"
                + "Lugar: " + super.getLugar() + "\n"
                + "Edad: " + super.getEdad() + "\n"
                + "Puntos de salud: " + super.getSalud() + "\n"
                + "Arma: " + super.getArma() + "\n";
    }

}
