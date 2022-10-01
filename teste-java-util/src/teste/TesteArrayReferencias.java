package teste;

import modelo.Pessoa;

public class TesteArrayReferencias {


    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[5];


        Pessoa pessoa1 = new Pessoa("Leonardo",23);
        Pessoa pessoa2 = new Pessoa("Joao",55);

       // pessoa1 = pessoa2; // Pessoa 1 aponta para onde Pessoa 2 esta apontando


        pessoas[0] = pessoa1;
        pessoas[1] = pessoa2;

        System.out.println(pessoas[0]);
        System.out.println(pessoas[1]);







    }
}
