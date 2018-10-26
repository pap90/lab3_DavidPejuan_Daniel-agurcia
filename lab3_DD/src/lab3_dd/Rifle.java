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

    @Override
    public String toString() {
        return "Rifle{" + "automatico=" + automatico + '}';
    }

}
