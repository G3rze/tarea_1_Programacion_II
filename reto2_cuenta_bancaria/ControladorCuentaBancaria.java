public class ControladorCuentaBancaria {
    private CuentaBancaria cuenta;

    public ControladorCuentaBancaria() {
        cuenta = null;
    }

    public void crearCuenta(String numeroCuenta, String titular, double balance) {
        System.out.println("\n--- Creando Cuenta Bancaria ---");
        System.out.println("Numero Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Balance inicial: " + balance);
        cuenta = new CuentaBancaria(numeroCuenta, titular, balance);
        System.out.println("Cuenta creada: " + cuenta);
    }

    public void probarConstructorSobrecargado() {
        System.out.println("\n=== Probando Constructores Sobrecargados ===");

        System.out.println("\n--- Constructor 1: Sin parametros ---");
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println(c1);

        System.out.println("\n--- Constructor 2: Numero cuenta y Titular ---");
        System.out.println("Entrada: ('006', 'Pedro Sanchez')");
        CuentaBancaria c2 = new CuentaBancaria("006", "Pedro Sanchez");
        System.out.println(c2);

        System.out.println("\n--- Constructor 3: Todos los parametros ---");
        System.out.println("Entrada: ('007', 'Ana Torres', 2000.00)");
        CuentaBancaria c3 = new CuentaBancaria("007", "Ana Torres", 2000.00);
        System.out.println(c3);
    }

    public void probarDepositos(double[] montos) {
        System.out.println("\n=== Probando Metodo depositar() ===");
        for (double monto : montos) {
            System.out.println("\n--- Depositando: " + monto + " ---");
            cuenta.depositar(monto);
            System.out.println("Balance actual: " + cuenta.getBalance());
        }
    }

    public void probarRetiros(double[] montos) {
        System.out.println("\n=== Probando Metodo retirar() ===");
        for (double monto : montos) {
            System.out.println("\n--- Retirando: " + monto + " ---");
            System.out.println("Balance antes del retiro: " + cuenta.getBalance());
            cuenta.retirar(monto);
            System.out.println("Balance despues del retiro: " + cuenta.getBalance());
        }
    }

    public void probarCasosInvalidors() {
        System.out.println("\n=== Probando casos invalidos ===");

        System.out.println("\n--- Deposito negativo: -100.00 ---");
        cuenta.depositar(-100.00);

        System.out.println("\n--- Retiro negativo: -50.00 ---");
        cuenta.retirar(-50.00);

        System.out.println("\n--- Retiro mayor al balance ---");
        System.out.println("Balance actual: " + cuenta.getBalance());
        cuenta.retirar(cuenta.getBalance() + 1000.00);
    }

    public void ejecutarDemo() {
        String[] numeros = DatosCuentaBancaria.obtenerNumerosCuenta();
        String[] titulares = DatosCuentaBancaria.obtenerTitulares();
        double[] balances = DatosCuentaBancaria.obtenerBalancesIniciales();
        double[] depositos = DatosCuentaBancaria.obtenerMontosDeposito();
        double[] retiros = DatosCuentaBancaria.obtenerMontosRetiro();

        System.out.println("=== RETO 2: CUENTA BANCARIA ===");
        System.out.println(" Creando metodos de accion depositar() y retirar()");
        System.out.println(" que manejen el balance de manera segura con transacciones validas");

        probarConstructorSobrecargado();

        crearCuenta(numeros[0], titulares[0], balances[0]);

        probarDepositos(depositos);

        probarRetiros(retiros);

        probarCasosInvalidors();

        System.out.println("\n=== Resumen Final ===");
        System.out.println(cuenta);
    }
}