public class DatosJugador {
    public static String[] obtenerNombres() {
        String[] nombres = {"Guerrero", "Arquero", "Mago", "Hechicero", "Paladin"};
        return nombres;
    }

    public static int[] obtenerVidasIniciales() {
        int[] vidas = {100, 80, 60, 70, 90};
        return vidas;
    }

    public static int[] obtenerNiveles() {
        int[] niveles = {1, 2, 3, 4, 5};
        return niveles;
    }

    public static int[] obtenerDanios() {
        int[] danios = {20, 35, 50, 45, 25, 60, 80, 100};
        return danios;
    }
}