public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String retirar(double monto) {
        try {
            if (monto > saldo) {
                return "\nError: Saldo insuficiente para retirar " + monto;
            }
            saldo -= monto;
            return "Retiro exitoso. Nuevo saldo: " + saldo;
        } catch (Exception e) {
            return "\nError inesperado en el retiro: " + e.getMessage();
        }
    }

    public String depositar(double monto) {
        try {
            if (monto < 0) {
                return "\nError: No se puede depositar un monto negativo: " + monto;
            }
            saldo += monto;
            return "\nDepósito exitoso. Nuevo saldo: " + saldo;
        } catch (Exception e) {
            return "Error inesperado en el depósito: " + e.getMessage();
        }
    }

    public String transferir(CuentaBancaria cuentaDestino, double monto) {
        String resultadoRetiro = this.retirar(monto);
        if (resultadoRetiro.startsWith("Error")) {
            return resultadoRetiro; // Retorna el mensaje de error
        }
        return cuentaDestino.depositar(monto);
    }
}
