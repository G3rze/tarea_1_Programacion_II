public class DatosInventario {
    public static String[] obtenerCodigos() {
        String[] codigos = {"P001", "P002", "P003", "P004", "P005"};
        return codigos;
    }

    public static String[] obtenerNombres() {
        String[] nombres = {"Lapiz", "Cuaderno", "Borrador", "Regla", "Tijeras"};
        return nombres;
    }

    public static double[] obtenerPrecios() {
        double[] precios = {0.50, 2.50, 0.25, 1.00, 3.50};
        return precios;
    }

    public static int[] obtenerStocks() {
        int[] stocks = {100, 50, 75, 30, 20};
        return stocks;
    }

    public static String[] obtenerCodigosBusqueda() {
        String[] codigos = {"P002", "P005", "P999", "P003"};
        return codigos;
    }
}