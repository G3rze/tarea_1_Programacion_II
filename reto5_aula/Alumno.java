public class Alumno {
    private String nombre;
    private String cedula;
    private int[] notas;

    public Alumno() {
        this("Sin nombre", "0000000000", new int[]{0, 0, 0, 0, 0});
    }

    public Alumno(String nombre, String cedula) {
        this(nombre, cedula, new int[]{0, 0, 0, 0, 0});
    }

    public Alumno(String nombre, String cedula, int[] notas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.notas = notas;
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

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        return (double) suma / notas.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno {Nombre: ").append(nombre)
          .append(", Cedula: ").append(cedula)
          .append(", Notas: [");
        for (int i = 0; i < notas.length; i++) {
            sb.append(notas[i]);
            if (i < notas.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("], Promedio: ").append(calcularPromedio()).append("}");
        return sb.toString();
    }
}