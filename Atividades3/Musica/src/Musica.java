public class Musica {
    String titulo;
    String artista;
    String album;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int numeroDeAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Titulo da musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Nome do album: " + album);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numeroDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numeroDeAvaliacoes;
    }
}
