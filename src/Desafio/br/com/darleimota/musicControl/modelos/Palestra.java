package Desafio.br.com.darleimota.musicControl.modelos;

public class Palestra extends Audio {
    private String palestrante;
    private String evento;
    private String tema;
    private String local;

    public Palestra(String titulo, int duracao, String palestrante, String evento,
                    String tema, String local) {
        setTitulo(titulo);
        setDuracao(duracao);
        this.palestrante = palestrante;
        this.evento = evento;
        this.tema = tema;
        this.local = local;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Palestrante: " + palestrante);
        System.out.println("Evento: " + evento);
        System.out.println("Tema: " + tema);
        System.out.println("Local: " + local);
        System.out.println("Duração: " + getDuracao() + "s");
        System.out.println("Reproduções: " + getReproducoes());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Média de avaliação: " + getClassificacaoMedia());
    }
}