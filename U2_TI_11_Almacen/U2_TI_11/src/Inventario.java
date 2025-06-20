public class Inventario {
    private Producto[] stock;

    public Inventario(int tam) {
        stock = new Producto[tam];
    }

    public boolean agregarProducto(Producto p) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == null) {
                stock[i] = p;
                return true;
            }
        }
        return false;
    }
    public boolean eliminarProducto(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i].getCodigo().equals(codigo)) {
                stock[i] = null;
                return true;
            }
        }
        return false;
    }
    public Producto buscar(String codigo) {
        for (Producto p : stock) {
            if (p != null && p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }
    public int totalItems() {
        int suma = 0;
        for (Producto p : stock) {
            if (p != null) {
                suma += p.getCantidad();
            }
        }
        return suma;
    }
}
