public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double balance;

    public CuentaBancaria() {
        this("000000", "Sin titular", 0.0);
    }

    public CuentaBancaria(String numeroCuenta, String titular) {
        this(numeroCuenta, titular, 0.0);
    }

    public CuentaBancaria(String numeroCuenta, String titular, double balance) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.balance = balance;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

    public boolean depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a depositar debe ser positivo.");
            return false;
        }
        balance = balance + monto;
        System.out.println("Deposito exitoso. Monto depositado: " + monto);
        System.out.println("Nuevo balance: " + balance);
        return true;
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser positivo.");
            return false;
        }
        if (monto > balance) {
            System.out.println("Error: Fondos insuficientes. No se puede retirar " + monto);
            System.out.println("Balance actual: " + balance);
            return false;
        }
        balance = balance - monto;
        System.out.println("Retiro exitoso. Monto retirado: " + monto);
        System.out.println("Nuevo balance: " + balance);
        return true;
    }

    @Override
    public String toString() {
        return "CuentaBancaria {Numero: " + numeroCuenta + ", Titular: " + titular + ", Balance: " + balance + "}";
    }
}