public class Main {
    public static void main(String[] args) {

        Garage miGarage = new Garage(4);

        Coche coche1 = new Coche("GANT1212", "Chevrolet", 4);
        Motocicleta motocicleta1 = new Motocicleta("XDD1010", "Yamaha", true);
        Coche coche2 = new Coche("GOUT9877", "Porche", 2);
        Motocicleta motocicleta2 = new Motocicleta("XDD1010", "Ducati", false);

        miGarage.estacionar(coche1);
        miGarage.estacionar(motocicleta1);
        miGarage.estacionar(coche2);
        miGarage.estacionar(motocicleta2);

        System.out.println("Vehículos en el garage: " + miGarage.contarVehiculos());
        miGarage.retirar("GOUT9877");
        System.out.println("Vehículos en el garage después de retirar: " + miGarage.contarVehiculos());
    }
}