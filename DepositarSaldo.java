public class DepositarSaldo {

    // metodo para depositar dinero en la cuenta
    public void depositar(Cuenta cuenta, double monto) {

        // validamos que el deposito sea > 0
        if (monto <= 0) {
            System.out.println("El deposito debe ser mayor a 0");
        }

        // validamos el limite permitido
        else if (monto > 10000000) {
            System.out.println("El deposito supera el limite permitido");
        }

        else {

            cuenta.saldo += monto;
            System.out.println("Deposito realizado correctamente");
        }

    }

}