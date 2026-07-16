public class Empleado {
    private String nombre;
    private String cedula;
    private double salario;

    public Empleado() {
        this("Sin nombre", "0000000000", 0.0);
    }

    public Empleado(String nombre, String cedula) {
        this(nombre, cedula, 500.0);
    }

    public Empleado(String nombre, String cedula, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Error: El salario no puede ser negativo. Se asigna 0.0");
            this.salario = 0.0;
        } else {
            this.salario = salario;
        }
    }

    @Override
    public String toString() {
        return "Empleado {Nombre: " + nombre + ", Cedula: " + cedula + ", Salario: " + salario + "}";
    }
}