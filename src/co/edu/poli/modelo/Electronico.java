package co.edu.poli.modelo;

public class Electronico extends Producto {
    private int voltajeEntrada;

    public Electronico(int id, String nombre, double precio, int voltajeEntrada) {
        super(id, nombre, precio);
        this.voltajeEntrada = voltajeEntrada;
    }

    public int getVoltajeEntrada() { return voltajeEntrada; }

    @Override
    public String obtenerInfo() {
        return "Electrónico: " + getNombre() + " - Voltaje: " + voltajeEntrada + "V";
    }
}
