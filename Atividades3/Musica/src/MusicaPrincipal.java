public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Taken For a Fool";
        minhaMusica.artista = "The Strokes";
        minhaMusica.album = "Angles";
        minhaMusica.anoDeLancamento = 2011;

        minhaMusica.exibirFichaTecnica();

        minhaMusica.avalia(4.8);
        minhaMusica.avalia(5.0);
        minhaMusica.avalia(4.7);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Media das Avaliacoes: " + mediaAvaliacoes);
    }
}
