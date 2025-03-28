package co.edu.poli.modelo;

public class Cliente {
    private int id;
    private String nombre;

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nombre='" + nombre + "'}";
    }
}
