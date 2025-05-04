package Desafio.br.com.darleimota.musicControl.modelos;

public class Podcast extends Audio {

    private String host;
    private String descricao;
    private String episodio;
    private String convidado;

    public Podcast(String titulo, int duracao, String host, String descricao, String episodio, String convidado) {
        setTitulo(titulo);
        setDuracao(duracao);
        this.host = host;
        this.descricao = descricao;
        this.episodio = episodio;
        this.convidado = convidado;
    }
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Host: " + host);
        System.out.println("Episódio: " + episodio);
        System.out.println("Convidado: " + convidado);
        System.out.println("Descrição: " + descricao);
        System.out.println("Duração: " + getDuracao() + "s");
        System.out.println("Reproduções: " + getReproducoes());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Média de avaliação: " + getClassificacaoMedia());
    }
}
