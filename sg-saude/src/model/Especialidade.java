package model;

public class Especialidade {

    private int id;
    private String nome;

    public String getNome() {
        return nome;
    }



    public Especialidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Especialidade(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                ", nome='" + nome + '\'' +
                '}';
    }
}
