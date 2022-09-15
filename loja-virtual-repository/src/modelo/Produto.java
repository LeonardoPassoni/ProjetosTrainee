package modelo;

public class Produto {

    private int id;
    private String nome;
    private String descricao;


    public Produto(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Produto (String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return
                "ID: " + this.id +
               '\n' + "Nome: " + this.nome +
               '\n' + "Descricao: " + this.descricao + '\n';
    }
}
