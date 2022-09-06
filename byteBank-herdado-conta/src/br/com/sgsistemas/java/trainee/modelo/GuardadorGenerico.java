package br.com.sgsistemas.java.trainee.modelo;

public class GuardadorGenerico {

    private Object[] array;
    private int posicao;


    public GuardadorGenerico(){
        this.array = new Object[10];
        this.posicao = 0;
    }

    public void  adiciona(Object objetoGenerico){
        this.array[this.posicao] = objetoGenerico;
        this.posicao++;
    }

    public int getQuantidadeElementos(){
        return this.posicao;
    }

    public Object getReferencia(int posicao){
        return this.array[posicao];

    }


}
