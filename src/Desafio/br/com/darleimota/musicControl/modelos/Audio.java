package Desafio.br.com.darleimota.musicControl.modelos;

public abstract class Audio implements Reproduzivel {

    private String titulo;
    private int duracao;
    private int curtidas;
    private int reproducoes;
    private int somaNotas;
    private int totalAvaliacoes;

    public Audio() {
    }

    @Override
    public void reproduzir() {
        this.reproducoes++;
    }

    @Override
    public void curtir() {
        this.curtidas++;
    }

    @Override
    public void classificar(int nota) {
        this.somaNotas += nota;
        this.totalAvaliacoes++;
    }
        // metodo com get pra calcular e retonar o calculo
    public double getMedia() {
        if (totalAvaliacoes == 0) return 0;
        return (double) somaNotas / totalAvaliacoes;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
        // aproveitamento de codigo com getMedia
    public double getClassificacaoMedia(){
        return getMedia();
    }
}


