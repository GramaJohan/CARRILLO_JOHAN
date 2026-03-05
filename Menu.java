import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        // utilizare scanner para recibir los datos del usuario
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese saldo inicial de la cuenta:");
        double saldoInicial = sc.nextDouble();


        Cuenta cuenta = new Cuenta(saldoInicial);

        int opcion;

        // ciclo que mantiene el programa ejecutandose hasta que el usuario le de salir y rompemos el ciclo
        do {

            // menu de opciones
            System.out.println("\n--- MENU BANCO ---");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    // Deposito
                    System.out.println("Ingrese monto a depositar:");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    break;

                case 2:
                    // Retiro
                    System.out.println("Ingrese monto a retirar:");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;

                case 3:
                    // ver saldo
                    System.out.println("Saldo actual: " + cuenta.verSaldo());
                    break;

                case 4:
                    // salir del menu
                    System.out.println("Gracias por usar el sistema");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 4);


        sc.close();
    }
}