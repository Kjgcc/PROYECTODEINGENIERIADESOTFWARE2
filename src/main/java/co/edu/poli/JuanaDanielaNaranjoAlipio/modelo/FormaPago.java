package co.edu.poli.JuanaDanielaNaranjoAlipio.modelo;



public class FormaPago {
    private boolean activa;

    public FormaPago(boolean activa) {
        this.activa = activa;
    }

    public void activar() {
        activa = true;
    }

    public void bloquear() {
        activa = false;
    }

    public boolean estaActiva() {
        return activa;
    }
}

