package Desafio.br.com.darleimota.musicControl.modelos;

public class Musica extends Audio{
    private String artista;
    private String album;
    private String genero;

    public Musica(String titulo, int duracao, String artista, String album, String genero) {
        setTitulo(titulo);
        setDuracao(duracao);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void exibirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + getDuracao() + "s");
        System.out.println("Reproduções: " + getReproducoes());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Média de avaliação: " + getClassificacaoMedia());
    }

}
