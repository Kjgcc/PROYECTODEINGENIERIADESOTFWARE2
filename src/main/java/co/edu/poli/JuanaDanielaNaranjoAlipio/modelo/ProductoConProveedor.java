package co.edu.poli.JuanaDanielaNaranjoAlipio.modelo;


public class ProductoConProveedor {
    private String nombreProducto;
    private Proveedor proveedor;

    public ProductoConProveedor(String nombreProducto, String nombreProveedor) {
        this.nombreProducto = nombreProducto;
        this.proveedor = ProveedorFactory.getProveedor(nombreProveedor);
    }

    public void mostrar() {
        System.out.println("Producto: " + nombreProducto + ", Proveedor: " + proveedor.getNombre());
    }
}
