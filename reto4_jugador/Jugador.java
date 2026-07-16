public class Jugador {
    private String nombre;
    private int puntosVida;
    private int nivel;

    public Jugador() {
        this("JugadorDefault", 100, 1);
    }

    public Jugador(String nombre) {
        this(nombre, 100, 1);
    }

    public Jugador(String nombre, int puntosVida, int nivel) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void recibirDanio(int dano) {
        System.out.println("\n--- " + nombre + " recibe " + dano + " puntos de dano ---");
        System.out.println("Vida antes: " + puntosVida);
        puntosVida = puntosVida - dano;
        if (puntosVida <= 0) {
            puntosVida = 0;
            System.out.println("Vida despues: " + puntosVida);
            System.out.println("!!! ALERTA: El jugador " + nombre + " HA MUERTO !!!");
        } else {
            System.out.println("Vida despues: " + puntosVida);
        }
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    @Override
    public String toString() {
        return "Jugador {Nombre: " + nombre + ", PuntosVida: " + puntosVida + ", Nivel: " + nivel + "}";
    }
}