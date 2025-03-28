package co.edu.poli.controlador;

import co.edu.poli.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) { productos.add(producto); }

    public List<Producto> obtenerProductos() { return productos; }

    public Producto buscarProducto(int id) {
        return productos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}

