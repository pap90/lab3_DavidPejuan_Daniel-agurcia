package lab3_dd;

import java.util.ArrayList;

public class Ejercito {

    private String nombre;
    private String region;
    private int victorias;
    private int dinero;
    ArrayList<soldado> Lista_Soldados = new ArrayList();

    public Ejercito() {
    }

    public Ejercito(String nombre, String region, int victorias, int dinero) {
        this.nombre = nombre;
        this.region = region;
        this.victorias = victorias;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<soldado> getLista_Soldados() {
        return Lista_Soldados;
    }

    public void setLista_Soldados(ArrayList<soldado> Lista_Soldados) {
        this.Lista_Soldados = Lista_Soldados;
    }

    public void add_soldado(soldado soldado) {
        if (Lista_Soldados.size() <= 5) {
            Lista_Soldados.add(soldado);
        } else {
            System.out.println("El ejercito esta lleno");
        }
    }

    @Override
    public String toString() {
        return "Ejercito{" + "nombre=" + nombre + ", region=" + region + ", victorias=" + victorias + ", dinero=" + dinero + ", Lista_Soldados=" + Lista_Soldados + '}';
    }

}
