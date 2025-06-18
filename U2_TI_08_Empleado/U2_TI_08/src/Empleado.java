public abstract class Empleado {
    private String id;
    private String nombre;
    private double salarioBase;

    public Empleado(String id, String nombre, double salarioBase) { // <-- Aquí está el constructor
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public abstract double calcularSalario();
}
