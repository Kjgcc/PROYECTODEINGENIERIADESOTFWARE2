package co.edu.poli.modelo;

interface Pago {
    void procesarPago(double monto);
}

class PagoNequi implements Pago {
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado con Nequi.");
    }
}

class PagoPayPal implements Pago {
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado con PayPal.");
    }
}

public class PagoAdapter {
    private Pago metodoPago;

    public PagoAdapter(Pago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago(double monto) {
        metodoPago.procesarPago(monto);
    }
}
