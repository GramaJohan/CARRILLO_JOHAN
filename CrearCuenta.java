public class CrearCuenta {

    // metodo para crear una cuenta con saldo inicial
    public void crear(Cuenta cuenta, double saldoInicial) {

        // El saldo inicial no sera negativo
        if (saldoInicial < 0) {
            System.out.println("El saldo no puede ser negativo. Se inicia en 0.");
            cuenta.saldo = 0;
        }

        // El saldo ingresado debe ser menos a 10.000.000
        else if (saldoInicial > 10000000) {
            System.out.println("El saldo supera el limite de 10 millones. Se inicia en 0.");
            cuenta.saldo = 0;
        }

        // si todo esta bien se guarda
        else {
            cuenta.saldo = saldoInicial;
        }

    }

}