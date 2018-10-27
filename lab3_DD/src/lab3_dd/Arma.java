package lab3_dd;

public class Arma {

    private String nombre;
    private int alcance;
    private int precio;

    public Arma() {
    }

    public Arma(String nombre, int alcance, int precio) {
        this.nombre = nombre;
        this.alcance = alcance;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}
