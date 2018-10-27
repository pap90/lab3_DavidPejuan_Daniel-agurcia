package lab3_dd;

public class Rifle extends Arma {

    boolean automatico;

    public Rifle() {
    }

    public Rifle(boolean automatico) {
        this.automatico = automatico;
    }

    public Rifle(boolean automatico, String nombre, int alcance, int precio) {
        super(nombre, alcance, precio);
        this.automatico = automatico;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public String toString() {
        String auto;
        if (automatico == true) {
            auto = "Si";
        } else {
            auto = "No";
        }
        return "Nombre: " + super.getNombre() + "\n" + "Alcance: " + super.getAlcance() + "\n" + "Precio: " + super.getPrecio() + "\n" + "Automatica: " + auto + "\n";
    }
}
