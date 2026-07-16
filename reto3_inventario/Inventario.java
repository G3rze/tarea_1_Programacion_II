public class Inventario {
    private static final int TAMANIO_MAXIMO = 10;
    private static Producto[] productos = new Producto[TAMANIO_MAXIMO];
    private static int contador = 0;

    public Inventario() {
    }

    public static boolean agregarProducto(Producto producto) {
        if (contador >= TAMANIO_MAXIMO) {
            System.out.println("Error: Inventario lleno. No se puede agregar mas productos.");
            return false;
        }
        productos[contador] = producto;
        contador++;
        System.out.println("Producto agregado: " + producto.getCodigo() + " - " + producto.getNombre());
        return true;
    }

    public static Producto buscarPorCodigo(String codigo) {
        System.out.println("\n--- Buscando producto con codigo: " + codigo + " ---");
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                System.out.println("Producto encontrado en posicion: " + i);
                return productos[i];
            }
        }
        System.out.println("Producto NO encontrado.");
        return null;
    }

    public static void mostrarTodosLosProductos() {
        System.out.println("\n=== Productos en Inventario (" + contador + "/" + TAMANIO_MAXIMO + ") ===");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + productos[i]);
        }
    }

    public static int getContador() {
        return contador;
    }

    public static int getTamanioMaximo() {
        return TAMANIO_MAXIMO;
    }
}