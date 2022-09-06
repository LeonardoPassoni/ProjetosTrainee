package br.com.sgsistemas.java.trainee.teste;

import br.com.sgsistemas.java.trainee.modelo.Cliente;
import br.com.sgsistemas.java.trainee.modelo.ContaCorrente;
import br.com.sgsistemas.java.trainee.modelo.ContaPoupanca;
import br.com.sgsistemas.java.trainee.modelo.GuardadorGenerico;

import java.util.ArrayList;

public class testeObjetoGenerico {
    public static void main(String[] args) {


        GuardadorGenerico guardadorGenerico = new GuardadorGenerico();



        ContaPoupanca contaPoupanca = new ContaPoupanca(11, 22);

        ContaCorrente contaCorrente = new ContaCorrente(11, 33);

        Cliente cliente = new Cliente();

        guardadorGenerico.adiciona(contaPoupanca);

        guardadorGenerico.adiciona(contaCorrente);

        guardadorGenerico.adiciona(cliente);

        int tam = guardadorGenerico.getQuantidadeElementos();


        ContaPoupanca teste = (ContaPoupanca) guardadorGenerico.getReferencia(0);

        Object teste1 =  guardadorGenerico.getReferencia(0);

        System.out.println(teste1.getClass());

        System.out.println(tam);
        System.out.println((teste.getNumero()));


    }

}
