public class Main {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero("Ana", 10.00);

        Transporte autobus = new Autobus();
        Transporte tren = new Tren();
        Transporte taxi = new Taxi();

        pasajero.pagarViaje(autobus);
        pasajero.finalizarViaje(autobus);

        pasajero.pagarViaje(tren);
        pasajero.finalizarViaje(tren);

        pasajero.pagarViaje(taxi);
        pasajero.finalizarViaje(taxi);
    }
}