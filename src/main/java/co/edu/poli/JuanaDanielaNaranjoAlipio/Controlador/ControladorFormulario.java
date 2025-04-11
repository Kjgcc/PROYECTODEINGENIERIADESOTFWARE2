package co.edu.poli.JuanaDanielaNaranjoAlipio.Controlador;

import co.edu.poli.JuanaDanielaNaranjoAlipio.modelo.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ControladorFormulario {

    // UI Elements
    @FXML private Button btnConfirmarPedidos;
    @FXML private Button btnRealizarPedido;
    @FXML private Button btnactualizar;
    @FXML private Button btneliminar;
    @FXML private Button btnlistar;
    @FXML private Button btnagregarCliente;

    @FXML private TextField txtDireccion;
    @FXML private TextField txtEmail;
    @FXML private TextField txtNombre;
    @FXML private TextField txtTelefono;

    @FXML private TableView<Cliente> tablaClientes;
    @FXML private TableColumn<Cliente, String> colNombre;
    @FXML private TableColumn<Cliente, String> colEmail;
    @FXML private TableColumn<Cliente, String> colTelefono;
    @FXML private TableColumn<Cliente, String> colDireccion;

    // Fachada para operaciones de cliente
    private ClienteFachada clienteFachada = new ClienteFachada();

    // Proxy para el control de productos (simulado)
    private ProductoProxy accesoProducto = new ProductoProxy("usuario", 0); // Cambia a "admin" para acceso total

    @FXML
    public void listarCliente(ActionEvent event) {
        listarClientes(event);
    }

    @FXML
    void agregarCliente(ActionEvent event) {
        Cliente cliente = new Cliente(
            txtNombre.getText(),
            txtEmail.getText(),
            txtTelefono.getText(),
            txtDireccion.getText()
        );
        clienteFachada.agregar(cliente);
        listarClientes(null);
        limpiarCampos();
    }

    @FXML
    void listarClientes(ActionEvent event) {
        ObservableList<Cliente> clientes = FXCollections.observableArrayList(clienteFachada.obtenerTodos());
        tablaClientes.setItems(clientes);
    }

    @FXML
    void eliminarCliente(ActionEvent event) {
        Cliente seleccionado = tablaClientes.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            clienteFachada.eliminar(seleccionado);
            listarClientes(null);
        }
    }

    @FXML
    void actualizarCliente(ActionEvent event) {
        Cliente seleccionado = tablaClientes.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            seleccionado.setNombre(txtNombre.getText());
            seleccionado.setEmail(txtEmail.getText());
            seleccionado.setTelefono(txtTelefono.getText());
            seleccionado.setDireccion(txtDireccion.getText());
            clienteFachada.actualizar(seleccionado);
            listarClientes(null);
        }
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtEmail.clear();
        txtTelefono.clear();
        txtDireccion.clear();
    }

    // Ejemplo de uso del patrón Flyweight con proveedores
    @FXML
    void usarFlyweightProveedores() {
        ProveedorFlyweightFactory factory = new ProveedorFlyweightFactory();

        Proveedor proveedor1 = factory.getProveedor("TechPro");
        Proveedor proveedor2 = factory.getProveedor("TechPro"); // Reutiliza la instancia

        System.out.println("¿Mismo proveedor? " + (proveedor1 == proveedor2)); // true
    }

    // Simulación de acceso con Proxy
    @FXML
    void accederProductos() {
        accesoProducto.mostrarProductos();
    }
}
