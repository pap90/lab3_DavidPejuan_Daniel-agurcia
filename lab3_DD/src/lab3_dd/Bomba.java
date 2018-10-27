package lab3_dd;

public class Bomba extends Arma {

    String material;

    public Bomba() {
    }

    public Bomba(String material) {
        this.material = material;
    }

    public Bomba(String material, String nombre, int alcance, int precio) {
        super(nombre, alcance, precio);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return "Nombre: " + super.getNombre() + "\n" + "Alcance: " + super.getAlcance() + "\n" + "Precio: " + super.getPrecio() + "\n" + "Material: " + material + "\n";
    }
}
