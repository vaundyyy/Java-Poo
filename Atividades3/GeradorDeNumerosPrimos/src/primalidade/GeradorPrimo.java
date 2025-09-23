package primalidade;

public class GeradorPrimo extends NumerosPrimos{
    public int gerarProximoPrimo (int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificadorPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}
