package co.edu.poli.modelo;

public class Alimento extends Producto {
    private int aporteCalorico;

    public Alimento(int id, String nombre, double precio, int aporteCalorico) {
        super(id, nombre, precio);
        this.aporteCalorico = aporteCalorico;
    }

    public int getAporteCalorico() { return aporteCalorico; }

    @Override
    public String obtenerInfo() {
        return "Alimento: " + getNombre() + " - Calorías: " + aporteCalorico + " kcal";
    }
}
