package co.edu.poli.modelo;

public class ProductoElectronico extends Producto {
    private int voltajeEntrada;

    public ProductoElectronico(String nombre, double precio, int voltaje) {
        super(nombre, precio);
        this.voltajeEntrada = voltaje;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Electrónico: " + nombre + " - Precio: $" + precio + " - Voltaje: " + voltajeEntrada + "V");
    }
}
