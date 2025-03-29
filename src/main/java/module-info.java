module co.edu.poli.proyecto {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.poli.controlador to javafx.fxml;
    opens co.edu.poli.vista to javafx.graphics, javafx.fxml;
}
