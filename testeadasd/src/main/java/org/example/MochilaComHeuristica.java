package org.example;

import java.util.*;

public class MochilaComHeuristica {

    static  int quantidadeItens;
    static  int capacidadeMaxima;

    static List<Item> itens = new ArrayList<>();
    static List<Item> itensNaMochila = new ArrayList<>();

    public static void main(String[] args) {

        itens =  lerDados();

        escolherItens(quantidadeItens,capacidadeMaxima);

        itensNaMochila.forEach(item -> System.out.println(item));


       // melhoramento(itensNaMochila);







    }

    private static void melhoramento(List<Item> itensNaMochila) {
        int capacidadeRestante = 0 ;
        int qtdadeItensRestantes = 0 ;

        for (Item item: itensNaMochila) {
            if(item.estaNaMochila)
                capacidadeRestante += item.peso;
        }

        capacidadeRestante -= capacidadeMaxima;

        itensNaMochila.sort(new sortItensDescPeso().reversed());
        System.out.println("AAAAAAAAAAAAAAAAAAAA");
        itensNaMochila.forEach(item -> System.out.println(item));


        capacidadeRestante += itensNaMochila.get(0).peso;


        itensNaMochila =  escolherItens(qtdadeItensRestantes,capacidadeRestante);
        itensNaMochila.get(0).estaNaMochila = false;

        System.out.println("AAAAAAAAAAAAAAAAAAAA");
        itensNaMochila.forEach(item -> System.out.println(item));




    }

    private static List<Item> escolherItens(int qtdadeItensRestantes, int capacidadeRestante) {

        int i = 0;

        while ( i < itens.size() && capacidadeRestante >= 0  && !itens.get(i).estaNaMochila){
            if(capacidadeRestante >= itens.get(i).peso) {
                capacidadeRestante -= itens.get(i).peso;
                itensNaMochila.add(itens.get(i));
                itens.remove(itens.get(i));

            }
            i++;

        }
        return itens;
    }


    public static class Item implements Comparable<Item>  {
        double valor ;
        double peso  ;
        double relacaoValorPeso ;

        boolean estaNaMochila = false;

        public Item(double valor, double peso) {
            this.valor = valor;
            this.peso = peso;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "valor=" + valor +
                    ", peso=" + peso +
                    ", relacaoValorPeso=" + relacaoValorPeso +
                    ", estaNaMochila=" + estaNaMochila +
                    '}';
        }



        @Override
        public int compareTo(Item item) {
            return Double.compare(this.relacaoValorPeso,item.relacaoValorPeso);
        }

    }


    public static List<Item> lerDados() {
        Scanner scanner = new Scanner(System.in);
        List<Item> itens = new ArrayList<>();

        quantidadeItens = scanner.nextInt();
        capacidadeMaxima = scanner.nextInt();


        for (int i = 0; i < quantidadeItens; i++) {
            Item item = new Item(
                    scanner.nextInt(),
                    scanner.nextInt()
            );

            item.relacaoValorPeso = item.valor/ item.peso;
            itens.add(item);
        }

        Collections.sort(itens,Collections.reverseOrder());

        return itens;

    }

    public static class sortItensDescPeso implements Comparator<Item>{

        @Override
        public int compare(Item item1, Item item2) {
            return Double.compare(item1.peso,item2.peso);
        }
    }
}

