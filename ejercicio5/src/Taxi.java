public class Taxi implements Transporte{
    @Override
    public void iniciarViaje() {
        System.out.println("Viaje en taxi iniciado.");
    }

    @Override
    public void detenerViaje() {
        System.out.println("Viaje en taxi detenido.");
    }

    @Override
    public double calcularTarifa() {
        return 5.00;
    }
}
