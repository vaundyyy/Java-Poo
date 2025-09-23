package primalidade;

public class Main {
    public static void main(String[] args) {
        VerificadorDeNumeroPrimo verificador = new VerificadorDeNumeroPrimo();
        verificador.verificarSeEPrimo(17);

        GeradorPrimo gerar = new GeradorPrimo();
        int proximoPrimo = gerar.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos p = new NumerosPrimos();
        p.listarPrimos(100);
    }
}
