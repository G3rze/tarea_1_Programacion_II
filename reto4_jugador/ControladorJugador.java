public class ControladorJugador {
    private Jugador[] jugadores;
    private int contador;

    public ControladorJugador() {
        jugadores = new Jugador[5];
        contador = 0;
    }

    public void registrarJugador(String nombre, int puntosVida, int nivel) {
        System.out.println("\n--- Registrando Jugador ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Puntos de Vida: " + puntosVida);
        System.out.println("Nivel: " + nivel);
        Jugador jug = new Jugador(nombre, puntosVida, nivel);
        jugadores[contador] = jug;
        contador++;
        System.out.println("Jugador registrado: " + jug);
    }

    public void probarConstructoresEncadenados() {
        System.out.println("\n=== Probando Constructores Encadenados ===");

        System.out.println("\n--- Constructor 1: Sin parametros ---");
        System.out.println("Llamada: new Jugador()");
        Jugador j1 = new Jugador();
        System.out.println("Resultado: " + j1);

        System.out.println("\n--- Constructor 2: Solo nombre ---");
        System.out.println("Llamada: new Jugador('Héroe Solitario')");
        Jugador j2 = new Jugador("Heroe Solitario");
        System.out.println("Resultado: " + j2);

        System.out.println("\n--- Constructor 3: Todos los parametros ---");
        System.out.println("Llamada: new Jugador('Campeon', 150, 10)");
        Jugador j3 = new Jugador("Campeon", 150, 10);
        System.out.println("Resultado: " + j3);
    }

    public void probarRecibirDanio() {
        System.out.println("\n=== Probando Metodo recibirDanio() ===");

        int[] danios = DatosJugador.obtenerDanios();

        System.out.println("\n--- Jugador 1 recibe dano progresivo ---");
        Jugador j1 = new Jugador("Guerrero", 100, 1);
        for (int i = 0; i < danios.length; i++) {
            j1.recibirDanio(danios[i]);
            if (!j1.estaVivo()) {
                System.out.println("El jugador esta muerto. Fin de la secuencia de dano.");
                break;
            }
        }

        System.out.println("\n--- Jugador 2 recibe dano hasta morir ---");
        Jugador j2 = new Jugador("Arquero", 75, 2);
        j2.recibirDanio(30);
        j2.recibirDanio(25);
        j2.recibirDanio(20);
        j2.recibirDanio(10);

        System.out.println("\n--- Jugador 3 recibe dano negativo (no afecta) ---");
        Jugador j3 = new Jugador("Mago", 60, 3);
        j3.recibirDanio(-50);
    }

    public void ejecutarDemo() {
        String[] nombres = DatosJugador.obtenerNombres();
        int[] vidas = DatosJugador.obtenerVidasIniciales();
        int[] niveles = DatosJugador.obtenerNiveles();

        System.out.println("=== RETO 4: JUGADOR DE ROL ===");
        System.out.println(" Construyendo constructores encadenados");
        System.out.println(" Metodo de accion recibirDanio() que resta puntos de vida");
        System.out.println(" y alerta si el jugador 'ha muerto'");

        probarConstructoresEncadenados();

        System.out.println("\n=== Registrando jugadores del grupo ===");
        for (int i = 0; i < nombres.length; i++) {
            registrarJugador(nombres[i], vidas[i], niveles[i]);
        }

        probarRecibirDanio();

        System.out.println("\n=== Resumen de jugadores registrados ===");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + jugadores[i]);
        }
    }
}