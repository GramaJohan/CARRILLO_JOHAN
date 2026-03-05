public class RetirarSaldo {

    // metodo para retirar dinero
    public void retirar(Cuenta cuenta, double monto) {

        // el retiro debe ser > 0
        if (monto <= 0) {
            System.out.println("El retiro debe ser mayor a 0");
        }

        // validamos que haya saldo suficiente
        else if (monto > cuenta.saldo) {
            System.out.println("Fondos insuficientes");
        }

        else {
            // restamos el monto al saldo
            cuenta.saldo -= monto;
            System.out.println("Retiro realizado correctamente");
        }

    }

}
