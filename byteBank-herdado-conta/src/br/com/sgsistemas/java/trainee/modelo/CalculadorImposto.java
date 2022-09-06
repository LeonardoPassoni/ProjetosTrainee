package br.com.sgsistemas.java.trainee.modelo;

public class CalculadorImposto {

    double totalImposto;


    public void registra(Tributavel tributavel){
        totalImposto += tributavel.getValorImposto();
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
