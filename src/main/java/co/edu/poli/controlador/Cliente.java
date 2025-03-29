package co.edu.poli.controlador;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cliente {
    private final StringProperty nombre;
    private final StringProperty email;
    private final StringProperty telefono;
    private final StringProperty direccion;

    public Cliente(String nombre, String email, String telefono, String direccion) {
        this.nombre = new SimpleStringProperty(nombre);
        this.email = new SimpleStringProperty(email);
        this.telefono = new SimpleStringProperty(telefono);
        this.direccion = new SimpleStringProperty(direccion);
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public StringProperty emailProperty() {
        return email;
    }

    public StringProperty telefonoProperty() {
        return telefono;
    }

    public StringProperty direccionProperty() {
        return direccion;
    }
}

