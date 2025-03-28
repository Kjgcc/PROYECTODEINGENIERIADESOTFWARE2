package co.edu.poli.controlador;

import co.edu.poli.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private static ClienteDAO instancia;
    private List<Cliente> clientes = new ArrayList<>();

    private ClienteDAO() {} // Constructor privado

    public static ClienteDAO getInstancia() {
        if (instancia == null) {
            try {
                instancia = new ClienteDAO();
            } catch (Exception e) {
                throw new RuntimeException("Error al crear instancia de ClienteDAO: " + e.getMessage());
            }
        }
        return instancia;
    }

    public void agregarCliente(Cliente cliente) { clientes.add(cliente); }

    public boolean eliminarCliente(int id) {
        return clientes.removeIf(c -> c.getId() == id);
    }

    public Cliente buscarCliente(int id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public List<Cliente> obtenerClientes() { return clientes; }
}
