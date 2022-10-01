package Modelo;

public class Aluno {


    private String nome;
    private String rg;
    private String cpf;
    private String dataNascimento;
    private Endereco endereco;



    public Aluno (String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public  void  setRg( String rg){
        this.rg = rg;
    }
    public String getRg(){
        return this.rg;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }



    @Override
    public String toString() {
        return
                "Nome: " + nome  + '\n'+ "CPF: "  + cpf + '\n'
                ;
    }
}
