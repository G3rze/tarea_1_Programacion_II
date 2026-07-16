public class DatosAula {
    public static String[] obtenerNombres() {
        String[] nombres = {"Juan Perez", "Maria Garcia", "Carlos Lopez", "Ana Martinez", "Luis Rodriguez"};
        return nombres;
    }

    public static String[] obtenerCedulas() {
        String[] cedulas = {"0912345678", "0923456789", "0934567890", "0945678901", "0956789012"};
        return cedulas;
    }

    public static int[][] obtenerNotasAlumnos() {
        int[][] notas = {
            {10, 9, 8, 7, 9},
            {8, 7, 9, 8, 10},
            {6, 8, 7, 9, 8},
            {9, 10, 9, 10, 9},
            {7, 8, 6, 7, 8}
        };
        return notas;
    }

    public static int[][] obtenerNotasAdicionales() {
        int[][] notas = {
            {5, 6, 7, 8, 9},
            {10, 9, 8, 7, 6}
        };
        return notas;
    }
}