package model;

public class Medicamento {

    private int id;
    private String nome;
    private String descricao;
    private double valor;


    public Medicamento (String nome,String descricao, double valor){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
