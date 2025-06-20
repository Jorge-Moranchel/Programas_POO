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
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNombre());
        }else {
            System.out.println("Producto no encontrado");
        }

        Producto noExiste = inventario.buscar("Z9");
        if (noExiste != null) {
            System.out.println("No existe: " + noExiste.getNombre());
        }else {
            System.out.println("Producto no encontrado");
        }

        System.out.println("Eliminamos P2: " + inventario.eliminarProducto("B2"));
        System.out.println("Total: " + inventario.totalItems());
        System.out.println("xdddddddddddddddddddddddddddddddddddddddd");

        System.out.println("Reintentamos agregar P4: " + inventario.agregarProducto(p4));
        System.out.println("Total: " + inventario.totalItems());


    }
}
