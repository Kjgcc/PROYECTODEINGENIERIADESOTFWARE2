package co.edu.poli.modelo;

public class Empleado {
    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }
}
