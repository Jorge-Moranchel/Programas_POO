public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleadoCompleto = new EmpleadoTiempoCompleto("JEMN1818", "Jorge Emmanuel", 3000.0, "Seguro Médico y Dental este es premium mucho beneficio");
        System.out.println("Salario de " + empleadoCompleto.getNombre() + " (Tiempo Completo): $" + empleadoCompleto.calcularSalario());

        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("JEMN1818", "Jorge Mora", 2500.0, 24);
        System.out.println("Salario de " + empleadoPorHoras.getNombre() + " (Por Horas): $" + empleadoPorHoras.calcularSalario());
    }
}