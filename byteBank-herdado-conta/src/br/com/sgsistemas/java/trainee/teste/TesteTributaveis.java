package br.com.sgsistemas.java.trainee.teste;


import br.com.sgsistemas.java.trainee.modelo.CalculadorImposto;
import br.com.sgsistemas.java.trainee.modelo.ContaCorrente;
import br.com.sgsistemas.java.trainee.modelo.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(222,2222);
        contaCorrente.deposita(100.0);

        ContaCorrente contaCorrente1 = null;
        contaCorrente1.deposita(100);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

       CalculadorImposto calculadorImposto = new CalculadorImposto();

       calculadorImposto.registra(contaCorrente);
       calculadorImposto.registra(seguroDeVida);

        System.out.println("Total Imposto: " + calculadorImposto.getTotalImposto());

    }
}
