public class DatosEmpleado {
    public static String[] obtenerNombres() {
        String[] nombres = {"Juan Perez", "Maria Garcia", "Carlos Lopez", "Ana Martinez", "Luis Rodriguez"};
        return nombres;
    }

    public static String[] obtenerCedulas() {
        String[] cedulas = {"0912345678", "0923456789", "0934567890", "0945678901", "0956789012"};
        return cedulas;
    }

    public static double[] obtenerSalarios() {
        double[] salarios = {450.50, 800.00, 1200.75, 650.25, 950.00};
        return salarios;
    }

    public static double[] obtenerSalariosInvalidos() {
        double[] salarios = {-100.00, 200.00, -50.00};
        return salarios;
    }
}