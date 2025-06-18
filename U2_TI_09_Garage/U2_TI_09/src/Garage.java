public class Garage {

    private Vehiculo[] espacios;

    public Garage(int numEspacios) {
        espacios =  new Vehiculo[numEspacios];
    }

    public boolean estacionar(Vehiculo v) {
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] == null) {
                espacios[i] = v;
                return true;
            }
        }
        return false;
    }
    public boolean retirar(String placa) {
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] != null && espacios[i].getPlaca().equals(placa)){
                espacios[i] = null;
            }
        }
        return true;
    }
    public int contarVehiculos(){
        int numeroVehiculos = 0;
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] != null) {
                numeroVehiculos = i++;
            }
        }
        return numeroVehiculos;
    }
}
