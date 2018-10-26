package lab3_dd;

public class Arma_Blanca extends Arma {

    String material;

    public Arma_Blanca() {
    }

    public Arma_Blanca(String material) {
        this.material = material;
    }

    public Arma_Blanca(String material, String nombre, int alcance, int precio) {
        super(nombre, alcance, precio);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
