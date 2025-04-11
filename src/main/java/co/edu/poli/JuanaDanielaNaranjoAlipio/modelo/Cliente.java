package co.edu.poli.JuanaDanielaNaranjoAlipio.modelo;

import javafx.util.Callback;

public class Cliente {

    private String id;
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;

    // Constructor con ID (por si lo usas para actualizar o eliminar)
    public Cliente(String id, String nombre, String email, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Constructor sin ID (por ejemplo, cuando creas un nuevo cliente)
    public Cliente(String nombre, String email, String telefono, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método toString para depuración o visualización
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", email=" + email +
               ", telefono=" + telefono + ", direccion=" + direccion + "]";
    }

	public static void actualizarCliente(Cliente seleccionado) {
		// TODO Auto-generated method stub
		
	}

	public static void eliminarCliente(Cliente seleccionado) {
		// TODO Auto-generated method stub
		
	}

	public static Callback obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}

