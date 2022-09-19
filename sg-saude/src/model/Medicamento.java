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

    public Medicamento(int id, String nome, String descricao, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Medicamento() {

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

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return
                nome
                ;
    }
}
