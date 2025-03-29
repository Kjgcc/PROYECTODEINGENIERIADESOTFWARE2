package co.edu.poli.modelo;

public class ProductoAlimento extends Producto {
    private int aporteCalorico;

    public ProductoAlimento(String nombre, double precio, int calorias) {
        super(nombre, precio);
        this.aporteCalorico = calorias;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Alimento: " + nombre + " - Precio: $" + precio + " - Calorías: " + aporteCalorico + " kcal");
    }
}

