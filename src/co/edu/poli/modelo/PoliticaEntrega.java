package co.edu.poli.modelo;

public class PoliticaEntrega {
    private String tipoEnvio;
    private int diasEstimados;

    public PoliticaEntrega(String tipoEnvio, int diasEstimados) {
        this.tipoEnvio = tipoEnvio;
        this.diasEstimados = diasEstimados;
    }

    public String getDescripcion() {
        return "Envío por " + tipoEnvio + ", entrega en " + diasEstimados + " días.";
    }
}
