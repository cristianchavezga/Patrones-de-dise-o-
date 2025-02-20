public class Pasajero {
    private String nombre;
    private double saldo;

    public Pasajero(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public void pagarViaje(Transporte transporte) {
        double tarifa = transporte.calcularTarifa();
        if (saldo >= tarifa) {
            saldo -= tarifa;
            System.out.println(nombre + " ha pagado $" + tarifa + " por el viaje.");
            transporte.iniciarViaje();
        } else {
            System.out.println(nombre + " no tiene saldo suficiente para pagar el viaje.");
        }
    }

    public void finalizarViaje(Transporte transporte) {
        transporte.detenerViaje();
        System.out.println("Saldo restante: $" + saldo);
    }
}
