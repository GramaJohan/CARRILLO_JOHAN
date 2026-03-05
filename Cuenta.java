public class Cuenta {


    private double saldo;

    // constructor para crear una cuenta
    public Cuenta(double saldoInicial) {

        // El saldo inicial no sera negativo
        if (saldoInicial < 0) {
            System.out.println("El saldo no puede ser negativo. Se inicia en 0.");
            saldo = 0;
        }
        //  El saldo ingresado debe ser menos a 10.000.000
        else if (saldoInicial > 10000000) {
            System.out.println("El saldo supera el limite de 10 millones. Se inicia en 0.");
            saldo = 0;
        }
        // si todo esta bien guardamos el saldo
        else {
            saldo = saldoInicial;
        }
    }

    // metodo para depositar dinero en la cuenta
    public void depositar(double monto) {

        // validamos que el deposito sea > 0
        if (monto <= 0) {
            System.out.println("El deposito debe ser mayor a 0");
        }
        // validamos el limite permitido
        else if (monto > 10000000) {
            System.out.println("El deposito supera el limite permitido");
        }
        else {
            // se suma el dinero al saldo actual
            saldo += monto;
            System.out.println("Deposito realizado correctamente");
        }

    }

    // metodo para retirar dinero
    public void retirar(double monto) {

        // el retiro debe ser > 0
        if (monto <= 0) {
            System.out.println("El retiro debe ser mayor a 0");
        }
        // validamos que haya saldo suficiente
        else if (monto > saldo) {
            System.out.println("Fondos insuficientes");
        }
        else {
            // restamos el monto al saldo
            saldo -= monto;
            System.out.println("Retiro realizado correctamente");
        }

    }

    // Devolvemos el saldo actual
    public double verSaldo() {
        return saldo;
    }

}