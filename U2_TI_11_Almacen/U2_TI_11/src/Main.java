public class Main {
    public static void main(String[] args) throws Exception {
        Inventario inventario = new Inventario(3);

        Producto p1 = new Producto("A1", "Pc gamer xd", 10);
        Producto p2 = new Producto("B2", "Manzanas", 3);
        Producto p3 = new Producto("C3", "Peras", 6);
        Producto p4 = new Producto("D4", "Naranjas", 9);

        System.out.println("Agregamos P1: " + inventario.agregarProducto(p1));
        System.out.println("Total: " + inventario.totalItems());
        System.out.println("----------------------------------------------------------");

        System.out.println("Agregamos P2: " + inventario.agregarProducto(p2));
        System.out.println("Total: " + inventario.totalItems());
        System.out.println("----------------------------------------------------------");

        System.out.println("Agregamos P3: " + inventario.agregarProducto(p3));
        System.out.println("Total: " + inventario.totalItems());
        System.out.println("----------------------------------------------------------");

        System.out.println("Agregamos P4 (Este debe fallar si o si xd): " + inventario.agregarProducto(p4));
        System.out.println("Total: " + inventario.totalItems());
        System.out.println("----------------------------------------------------------");

        Producto encontrado = inventario.buscar("B2");
        System.out.println("Buscar B2: " + (encontrado != null ? encontrado.getNombre() : "No encontrado"));
        System.out.println("----------------------------------------------------------");

        Producto noExiste = inventario.buscar("Z9");
        System.out.println("Buscar pero no existe Z9: " + (noExiste != null ? noExiste.getNombre() : "No encontrado"));
        System.out.println("----------------------------------------------------------");

        System.out.println("Eliminar B2: " + inventario.eliminarProducto("B2"));
        System.out.println("Total: " + inventario.totalItems());
        System.out.println("----------------------------------------------------------");

        System.out.println("Agregar p4 de nuez: " + inventario.agregarProducto(p4));
        System.out.println("Total: " + inventario.totalItems());

    }
}
