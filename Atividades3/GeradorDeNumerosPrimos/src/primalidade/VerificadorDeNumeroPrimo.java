package primalidade;

public class VerificadorDeNumeroPrimo extends NumerosPrimos{
    public void verificarSeEPrimo (int numero) {
        if (verificadorPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " nao é primo.");
        }
    }
}
