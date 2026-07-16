public class ControladorInventario {
    public ControladorInventario() {
    }

    public void cargarProductosIniciales() {
        System.out.println("=== Cargando productos iniciales al inventario ===");
        String[] codigos = DatosInventario.obtenerCodigos();
        String[] nombres = DatosInventario.obtenerNombres();
        double[] precios = DatosInventario.obtenerPrecios();
        int[] stocks = DatosInventario.obtenerStocks();

        for (int i = 0; i < codigos.length; i++) {
            Producto producto = new Producto(codigos[i], nombres[i], precios[i], stocks[i]);
            Inventario.agregarProducto(producto);
        }
    }

    public void probarBuscarPorCodigo() {
        System.out.println("\n=== Probando Metodo buscarPorCodigo() ===");
        String[] codigosBusqueda = DatosInventario.obtenerCodigosBusqueda();

        for (String codigo : codigosBusqueda) {
            Producto encontrado = Inventario.buscarPorCodigo(codigo);
            if (encontrado != null) {
                System.out.println("Detalles: " + encontrado);
            } else {
                System.out.println("No se encontraron detalles para este codigo.");
            }
        }
    }

    public void probarInventarioLleno() {
        System.out.println("\n=== Probando llenado del inventario ===");
        System.out.println("Capacidad maxima: " + Inventario.getTamanioMaximo());
        System.out.println("Productos actuales: " + Inventario.getContador());

        System.out.println("\n--- Intentando agregar productos hasta llenar ---");
        for (int i = 0; i < 7; i++) {
            Producto producto = new Producto("PX" + i, "Producto Extra " + i, 10.00, 10);
            Inventario.agregarProducto(producto);
        }

        System.out.println("\nProductos en inventario: " + Inventario.getContador());
    }

    public void ejecutarDemo() {
        System.out.println("=== RETO 3: INVENTARIO ===");
        System.out.println(" Agrupando objetos Producto en un arreglo estatico de tamanho fijo");
        System.out.println(" Creando metodo para buscar un producto por su codigo");

        System.out.println("\nTamanio del arreglo estatico: " + Inventario.getTamanioMaximo());

        cargarProductosIniciales();

        Inventario.mostrarTodosLosProductos();

        probarBuscarPorCodigo();

        probarBuscarPorCodigo();

        probarInventarioLleno();

        Inventario.mostrarTodosLosProductos();
    }
}