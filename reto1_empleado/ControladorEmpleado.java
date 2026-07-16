public class ControladorEmpleado {
    private Empleado[] empleados;
    private int contador;

    public ControladorEmpleado() {
        empleados = new Empleado[10];
        contador = 0;
    }

    public void registrarEmpleado(String nombre, String cedula, double salario) {
        if (contador >= empleados.length) {
            System.out.println("Error: No se puede registrar mas empleados. Limite alcanzado.");
            return;
        }
        System.out.println("\n--- Registrando Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Salario solicitado: " + salario);
        Empleado emp = new Empleado(nombre, cedula, salario);
        empleados[contador] = emp;
        contador++;
        System.out.println("Estado: " + emp);
    }

    public void probarConstructorSobrecargado() {
        System.out.println("\n=== Probando Constructores Sobrecargados ===");

        System.out.println("\n--- Constructor 1: Sin parametros ---");
        Empleado emp1 = new Empleado();
        System.out.println(emp1);

        System.out.println("\n--- Constructor 2: Nombre y Cedula ---");
        System.out.println("Entrada: ('Pedro Sanchez', '0961234567')");
        Empleado emp2 = new Empleado("Pedro Sanchez", "0961234567");
        System.out.println(emp2);

        System.out.println("\n--- Constructor 3: Todos los parametros ---");
        System.out.println("Entrada: ('Ana Torres', '0977654321', 1500.00)");
        Empleado emp3 = new Empleado("Ana Torres", "0977654321", 1500.00);
        System.out.println(emp3);
    }

    public void probarSetSalario() {
        System.out.println("\n=== Probando Setter setSalario con validacion ===");

        System.out.println("\n--- Salario valido: 750.50 ---");
        Empleado emp = new Empleado("Test", "0000000000", 500.0);
        emp.setSalario(750.50);
        System.out.println(emp);

        System.out.println("\n--- Salario invalido: -200.00 ---");
        emp.setSalario(-200.00);
        System.out.println(emp);
    }

    public void ejecutarDemo() {
        String[] nombres = DatosEmpleado.obtenerNombres();
        String[] cedulas = DatosEmpleado.obtenerCedulas();
        double[] salarios = DatosEmpleado.obtenerSalarios();
        double[] salariosInvalidos = DatosEmpleado.obtenerSalariosInvalidos();

        System.out.println("=== RETO 1: EMPLEADO ===");
        System.out.println(" Modelando clase Empleado con constructor sobrecargado");
        System.out.println(" y validacion en setter para salario nunca sea negativo");

        probarConstructorSobrecargado();

        System.out.println("\n=== Probando registro de empleados ===");
        for (int i = 0; i < nombres.length; i++) {
            registrarEmpleado(nombres[i], cedulas[i], salarios[i]);
        }

        System.out.println("\n=== Probando salario negativo ===");
        for (double salario : salariosInvalidos) {
            System.out.println("\n--- Intentando registrar con salario: " + salario + " ---");
            registrarEmpleado("Temporal", "9999999999", salario);
        }

        System.out.println("\n=== Cambiando salario a empleado existente ===");
        if (contador > 0) {
            System.out.println("Salario actual: " + empleados[0].getSalario());
            System.out.println("Nuevo salario: 999.99");
            empleados[0].setSalario(999.99);
            System.out.println("Salario actualizado: " + empleados[0].getSalario());
        }
    }
}