public class Main {
    public static void main(String[] args) {

        Garage miGarage = new Garage(4);

        Coche coche1 = new Coche("ABC2020", "Nissan", 4);
        Motocicleta motocicleta1 = new Motocicleta("DEF1989", "Kawakasi", false);
        Coche coche2 = new Coche("GHI789", "McLaren", 2);
        Motocicleta motocicleta2 = new Motocicleta("XDD1617", "Honda", true);

        miGarage.estacionar(coche1);
        miGarage.estacionar(motocicleta1);
        miGarage.estacionar(coche2);
        miGarage.estacionar(motocicleta2);

        System.out.println("Vehículos en el garage: " + miGarage.contarVehiculos());
        miGarage.retirar("DEF1989");
        miGarage.retirar("ABC2021");
        System.out.println("Vehículos en el garage después de retirar: " + miGarage.contarVehiculos());
    }
}