package co.edu.poli.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControladorFormulario {

    @FXML
    private TextField txtNombre;

    @FXML
    private Button btnEnviar;

    @FXML
    private void enviarDatos() {
        System.out.println("Nombre ingresado: " + txtNombre.getText());
    }
}
