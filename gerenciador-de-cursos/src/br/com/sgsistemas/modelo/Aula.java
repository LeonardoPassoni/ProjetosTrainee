package br.com.sgsistemas.modelo;

public class Aula {

    private  String titulo;
    private int tempoAula;


    public Aula (String titulo,int tempoAula){
        this.titulo = titulo;
        this.tempoAula = tempoAula;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getTempoAula() {
        return tempoAula;
    }
}
