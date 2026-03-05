import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        // utilizare scanner para recibir los datos del usuario
        Scanner sc = new Scanner(System.in);


        Cuenta cuenta = new Cuenta();

        // creamos los objetos de cada operacion
        CrearCuenta crear = new CrearCuenta();
        DepositarSaldo depositar = new DepositarSaldo();
        RetirarSaldo retirar = new RetirarSaldo();
        VerSaldo ver = new VerSaldo();

        System.out.println("Ingrese saldo inicial de la cuenta:");
        double saldoInicial = sc.nextDouble();


        crear.crear(cuenta, saldoInicial);

        int opcion;

        // ciclo que mantiene el programa ejecutandose hasta que el usuario le de salir
        do {

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
                    depositar.depositar(cuenta, deposito);
                    break;

                case 2:
                    // Retiro
                    System.out.println("Ingrese monto a retirar:");
                    double retiro = sc.nextDouble();
                    retirar.retirar(cuenta, retiro);
                    break;

                case 3:
                    // ver saldo
                    System.out.println("Saldo actual: " + ver.ver(cuenta));
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
