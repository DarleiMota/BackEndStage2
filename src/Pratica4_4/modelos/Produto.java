package Pratica4_4.modelos;

public abstract class Produto {
    private String nome;
    private double precoBase;
    private String codigo;

    public Produto(String nome, double precoBase, String codigo) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}