package co.edu.poli.modelo;

public class ProductoA extends Producto {
    private String categoria;

    public ProductoA(int id, String nombre, double precio, String categoria) {
        super(id, nombre, precio);
        this.categoria = categoria;
    }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

	@Override
	public String obtenerInfo() {
		return null;
	}
}
