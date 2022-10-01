package Modelo;

public class Endereco {

    private String logradouro;
    private String complemento;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;


    public Endereco ( String logradouro, String numero){
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getBairro(){
        return this.bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCep(){
        return this.cep;
    }

    public  void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return this.cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogradouro(){
        return  this.logradouro;
    }

    public  void  setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

}
