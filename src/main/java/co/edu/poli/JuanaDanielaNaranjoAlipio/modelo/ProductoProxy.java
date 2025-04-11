package co.edu.poli.JuanaDanielaNaranjoAlipio.modelo;



public class ProductoProxy implements Producto {
    private ProductoReal productoReal;
    private String nombre;
    private int nivelUsuario;

    public ProductoProxy(String nombre, int nivelUsuario) {
        this.nombre = nombre;
        this.nivelUsuario = nivelUsuario;
    }

    @Override
    public void mostrarDetalles() {
        if (nivelUsuario >= 2) {
            if (productoReal == null) {
                productoReal = new ProductoReal(nombre);
            }
            productoReal.mostrarDetalles();
        } else {
            System.out.println("Acceso denegado: Nivel de autorización insuficiente.");
        }
    }

	public void mostrarProductos() {
		// TODO Auto-generated method stub
		
	}
}

