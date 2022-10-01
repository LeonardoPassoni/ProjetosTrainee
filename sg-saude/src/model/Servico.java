package model;

public class Servico {

    private int id;
    private String nomeServico;
    private double valorServico;


    public Servico(String nomeServico, double valorServico) {
        this.nomeServico = nomeServico;
        this.valorServico = valorServico;
    }

    public Servico(int id, String nomeServico, double valorServico) {
        this.id = id;
        this.nomeServico = nomeServico;
        this.valorServico = valorServico;
    }

    public Servico() {

    }

    public String getNomeServico() {
        return nomeServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
               nomeServico
      ;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }
}
