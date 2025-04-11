package co.edu.poli.JuanaDanielaNaranjoAlipio.modelo;
import java.util.ArrayList;
import java.util.List;

public class HistorialPedidos {
    private List<String> pedidos = new ArrayList<>();

    public void agregarPedido(String pedido) {
        pedidos.add(pedido);
    }

    public List<String> obtenerHistorial() {
        return pedidos;
    }
}
