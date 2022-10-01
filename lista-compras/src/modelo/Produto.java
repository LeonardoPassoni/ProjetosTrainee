package modelo;

import java.util.ArrayList;

public class Produto {

    private   String codigo;
    private   String nome;
    private   double valor = 0.0;

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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



    public void cadastrarProduto(String nome,String codigo,double valor){
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }


    @Override
    public String toString() {
        return
                 nome + "         " + valor + '\n';


    }
}
