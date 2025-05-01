package co.edu.poli.JuanaDanielaNaranjoAlipio.modelo;


public class FachadaCliente {
    private ClienteInfo info;
    private HistorialPedidos historial;
    private FormaPago formaPago;

    public FachadaCliente(String nombre, String email, String telefono, String direccion) {
        this.info = new ClienteInfo(nombre, email, telefono, direccion);
        this.historial = new HistorialPedidos();
        this.formaPago = new FormaPago(true);
    }

    public ClienteInfo getInfo() {
        return info;
    }

    public HistorialPedidos getHistorial() {
        return historial;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }
}

