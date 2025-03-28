package co.edu.poli.modelo;

public class ProductoClone implements Cloneable {
    private int id;
    private String nombre;
    private double precio;

    public ProductoClone(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public ProductoClone clone() {
        try {
            return (ProductoClone) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}
