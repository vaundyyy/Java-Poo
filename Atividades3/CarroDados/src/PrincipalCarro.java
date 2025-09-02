public class PrincipalCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Audi RS6 Avant";
        meuCarro.ano = 2020;
        meuCarro.cor = "Vermelho";

        meuCarro.exibeFichaTecnica();

        System.out.println("Idade do carro: " + meuCarro.calculadoraIdade());
    }
}
