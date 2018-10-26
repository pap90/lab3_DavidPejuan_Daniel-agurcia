package lab3_dd;

import java.util.ArrayList;

public class Ejercito {

    private String nombre;
    private String region;
    private int victorias;
    ArrayList<soldado> Lista_Soldados = new ArrayList();

    public Ejercito() {
    }

    public Ejercito(String nombre, String region) {
        this.nombre = nombre;
        this.region = region;
        this.victorias =0;
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

    public ArrayList<soldado> getLista_Soldados() {
        return Lista_Soldados;
    }

    public void setLista_Soldados(ArrayList<soldado> Lista_Soldados) {
        this.Lista_Soldados = Lista_Soldados;
    }

    @Override
    public String toString() {
        return "Ejercito{" + "nombre=" + nombre + ", region=" + region + ", victorias=" + victorias + ", Lista_Soldados=" + Lista_Soldados + '}';
    }

}
