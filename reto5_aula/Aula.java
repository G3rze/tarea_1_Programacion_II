public class Aula {
    private static final int TAMANIO_MAXIMO = 10;
    private static Alumno[] alumnos = new Alumno[TAMANIO_MAXIMO];
    private static int contador = 0;

    public Aula() {
    }

    public static boolean agregarAlumno(Alumno alumno) {
        if (contador >= TAMANIO_MAXIMO) {
            System.out.println("Error: Aula llena. No se puede agregar mas alumnos.");
            return false;
        }
        alumnos[contador] = alumno;
        contador++;
        System.out.println("Alumno agregado: " + alumno.getNombre());
        return true;
    }

    public static double calcularPromedioGlobal() {
        System.out.println("\n--- Calculando promedio global del salon ---");
        double sumaPromedios = 0.0;

        for (int i = 0; i < contador; i++) {
            double promedioAlumno = alumnos[i].calcularPromedio();
            System.out.println("Alumno " + (i + 1) + ": " + alumnos[i].getNombre() +
                             " - Promedio: " + promedioAlumno);
            sumaPromedios = sumaPromedios + promedioAlumno;
        }

        if (contador == 0) {
            System.out.println("No hay alumnos en el salon.");
            return 0.0;
        }

        double promedioGlobal = sumaPromedios / contador;
        System.out.println("Suma de promedios: " + sumaPromedios);
        System.out.println("Cantidad de alumnos: " + contador);
        System.out.println("Promedio global del salon: " + promedioGlobal);
        return promedioGlobal;
    }

    public static void mostrarTodosLosAlumnos() {
        System.out.println("\n=== Alumnos en el Aula (" + contador + "/" + TAMANIO_MAXIMO + ") ===");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + alumnos[i]);
        }
    }

    public static int getContador() {
        return contador;
    }

    public static int getTamanioMaximo() {
        return TAMANIO_MAXIMO;
    }
}