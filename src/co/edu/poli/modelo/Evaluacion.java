package co.edu.poli.modelo;

public class Evaluacion {
    private int id;
    private String descripcion;
    private double calificacion;

    public Evaluacion(int id, String descripcion, double calificacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }
}


