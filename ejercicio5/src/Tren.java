public class Tren implements Transporte{
    @Override
    public void iniciarViaje() {
        System.out.println("Viaje en tren iniciado.");
    }

    @Override
    public void detenerViaje() {
        System.out.println("Viaje en tren detenido.");
    }

    @Override
    public double calcularTarifa() {
        return 2.00;
    }
}
