package co.edu.poli.JuanaDanielaNaranjoAlipio.modelo;


public class ProductoReal implements Producto {
    private String nombre;

    public ProductoReal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del producto: " + nombre);
    }
}
