package Desafio.br.com.darleimota.musicControl.modelos;

public class AudioLivro extends Audio {
    private String autor;
    private String editora;
    private String genero;
    private String narrador;


    public AudioLivro(String titulo, int duracao, String autor, String editora,
                      String genero, String narrador) {
        setTitulo(titulo);
        setDuracao(duracao);
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.narrador = narrador;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Gênero: " + genero);
        System.out.println("Narrador: " + narrador);
        System.out.println("Duração: " + getDuracao() + "s");
        System.out.println("Reproduções: " + getReproducoes());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Média de avaliação: " + getClassificacaoMedia());
    }
}
