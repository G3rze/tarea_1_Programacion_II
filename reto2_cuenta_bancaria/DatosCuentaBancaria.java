public class DatosCuentaBancaria {
    public static String[] obtenerNumerosCuenta() {
        String[] numeros = {"001", "002", "003", "004", "005"};
        return numeros;
    }

    public static String[] obtenerTitulares() {
        String[] titulares = {"Juan Perez", "Maria Garcia", "Carlos Lopez", "Ana Martinez", "Luis Rodriguez"};
        return titulares;
    }

    public static double[] obtenerBalancesIniciales() {
        double[] balances = {1000.00, 2500.50, 500.00, 1500.00, 3000.00};
        return balances;
    }

    public static double[] obtenerMontosDeposito() {
        double[] montos = {500.00, 100.00, 1000.00};
        return montos;
    }

    public static double[] obtenerMontosRetiro() {
        double[] montos = {200.00, 500.00, 3000.00, 100.00};
        return montos;
    }
}