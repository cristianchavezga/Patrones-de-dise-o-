public class Autobus implements Transporte{
    @Override
    public void iniciarViaje() {
        System.out.println("Viaje en autobús iniciado.");
    }

    @Override
    public void detenerViaje() {
        System.out.println("Viaje en autobús detenido.");
    }

    @Override
    public double calcularTarifa() {
        return 1.50;
    }
}
