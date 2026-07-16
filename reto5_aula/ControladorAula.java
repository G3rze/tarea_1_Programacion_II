public class ControladorAula {
    public ControladorAula() {
    }

    public void cargarAlumnosIniciales() {
        System.out.println("=== Cargando alumnos iniciales al aula ===");
        String[] nombres = DatosAula.obtenerNombres();
        String[] cedulas = DatosAula.obtenerCedulas();
        int[][] notas = DatosAula.obtenerNotasAlumnos();

        for (int i = 0; i < nombres.length; i++) {
            Alumno alumno = new Alumno(nombres[i], cedulas[i], notas[i]);
            Aula.agregarAlumno(alumno);
        }
    }

    public void probarConstructorSobrecargado() {
        System.out.println("\n=== Probando Constructores Sobrecargados de Alumno ===");

        System.out.println("\n--- Constructor 1: Sin parametros ---");
        Alumno a1 = new Alumno();
        System.out.println(a1);

        System.out.println("\n--- Constructor 2: Nombre y Cedula ---");
        System.out.println("Entrada: ('Pedro Sanchez', '0961234567')");
        Alumno a2 = new Alumno("Pedro Sanchez", "0961234567");
        System.out.println(a2);

        System.out.println("\n--- Constructor 3: Todos los parametros ---");
        System.out.println("Entrada: ('Ana Torres', '0977654321', {9,8,7,9,10})");
        int[] notasTorres = {9, 8, 7, 9, 10};
        Alumno a3 = new Alumno("Ana Torres", "0977654321", notasTorres);
        System.out.println(a3);
        System.out.println("Promedio de Ana Torres: " + a3.calcularPromedio());
    }

    public void probarAgregarAlumnos() {
        System.out.println("\n=== Probando agregar mas alumnos ===");
        int[][] notasAdicionales = DatosAula.obtenerNotasAdicionales();

        String[] nombresExtra = {"Pedro Fernandez", "Sofia Castro"};
        String[] cedulasExtra = {"0981234567", "0992345678"};

        for (int i = 0; i < nombresExtra.length; i++) {
            Alumno alumno = new Alumno(nombresExtra[i], cedulasExtra[i], notasAdicionales[i]);
            Aula.agregarAlumno(alumno);
        }
    }

    public void probarCalculoPromedio() {
        System.out.println("\n=== Probando calculo de promedio global ===");
        double promedioGlobal = Aula.calcularPromedioGlobal();
        System.out.println("Promedio global calculado: " + promedioGlobal);
    }

    public void ejecutarDemo() {
        System.out.println("=== RETO 5: AULA ESTUDIANTIL ===");
        System.out.println(" Creando arreglo estatico de objetos de tipo Alumno");
        System.out.println(" Funcion que calcula de forma iterativa el promedio global del salon");
        System.out.println(" Cada alumno tiene arreglo int[5] de notas por materia");

        System.out.println("\nTamanio maximo del aula: " + Aula.getTamanioMaximo());

        probarConstructorSobrecargado();

        cargarAlumnosIniciales();

        Aula.mostrarTodosLosAlumnos();

        probarAgregarAlumnos();

        Aula.mostrarTodosLosAlumnos();

        probarCalculoPromedio();

        System.out.println("\n=== Resumen Final ===");
        System.out.println("Total de alumnos en el aula: " + Aula.getContador());
        Aula.mostrarTodosLosAlumnos();
    }
}