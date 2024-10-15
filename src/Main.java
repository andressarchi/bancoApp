import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria("jara", 500.00);
        CuentaBancaria cuenta2 = new CuentaBancaria("Bob", 300.00);

        System.out.println("Saldo inicial de " + cuenta1.getTitular() + ": " + cuenta1.getSaldo());
        System.out.println("Saldo inicial de " + cuenta2.getTitular() + ": " + cuenta2.getSaldo());

        // Intentar retirar dinero
        System.out.println(cuenta1.getTitular()+cuenta1.retirar(200)); // Retiro exitoso

        // Intentar depositar dinero
        System.out.println(cuenta2.depositar(150)); // Depósito exitoso

        // Intentar transferir dinero
        System.out.println(cuenta1.transferir(cuenta2, 100)); // Transferencia exitosa
        System.out.println("Nuevo saldo de " + cuenta1.getTitular() + ": " + cuenta1.getSaldo());
        System.out.println("Nuevo saldo de " + cuenta2.getTitular() + ": " + cuenta2.getSaldo());

        // Intentar retirar más de lo que hay en la cuenta
        System.out.println(cuenta1.retirar(500)); // Mensaje de error
    }
}
