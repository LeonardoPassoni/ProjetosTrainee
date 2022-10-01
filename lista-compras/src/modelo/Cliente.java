package modelo;

public class Cliente /*implements Comparable<Cliente>*/{

    private String codigo;
    private String nome;
    private  String cpf;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente: \n" +
                 nome +
                ", CPF: " + cpf
                ;
    }

//    @Override
//    public int compareTo(Cliente conta) {
//        return this.getNome().compareTo(conta.getNome());
//    }
}
