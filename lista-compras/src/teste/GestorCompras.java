package teste;

import modelo.Cliente;
import modelo.Compra;
import modelo.Produto;

import java.util.*;

public class GestorCompras {

    public static void main(String[] args) {
//        Compra compra = new Compra();
//
//        int opcao = 0;
//        Scanner scanner = new Scanner(System.in);
//
//
//        while (opcao != 3) {
//            try {
//
//                scanner = new Scanner(System.in);
//
//                System.out.println("\nSelecione a opção desejada:");
//                System.out.println("1 - Inserir Produto carrinho");
//                System.out.println("2 - Remover Produto carrinho");
//                System.out.println("3 - Finalizar Compra\n");
//                System.out.println(opcao);
//                opcao = scanner.nextInt();
//
//                Produto produto = new Produto();
//
//                switch (opcao) {
//
//                    case 1:
//                        produto.cadastrarProduto("teste", "0001", 200.0);
//                        compra.adicionarProduto(produto);
//                        break;
//
//                    case 2:
//                        compra.removerProduto("0001");
//                        break;
//
//                    case 3:
//                        compra.calculaTotalCompra();
//                        compra.imprimiCompra();
//                        break;
//
//
//                    default:
//                        throw new InputMismatchException("Numero Invalido");
//                }
//
//            } catch (InputMismatchException exception) {
//                System.out.println(exception.getMessage());
//            }



          Produto produto = new Produto();
          produto.cadastrarProduto("Produto01","0001",200.0);

          Produto produto1 = new Produto();
          produto1.cadastrarProduto("Produto02","0002",400.0);

          Produto produto2 = new Produto();
          produto2.cadastrarProduto("Produto03","0003",100.0);


          Produto produto3 = new Produto();
          produto3.cadastrarProduto("Produto04","0004",500.0);




        Cliente cliente = new Cliente();
        cliente.setNome("Leonardo");
        cliente.setCodigo("01");
        cliente.setCpf("101.956.984-76");



        Compra compra = new Compra();
        compra.setCliente(cliente);
        compra.setDataCompra(new Date());

        compra.adicionarProduto(produto);
        compra.adicionarProduto(produto1);
        compra.adicionarProduto(produto2);
        compra.adicionarProduto(produto3);

      //  compra.removerProduto("0001");


//        compra.calculaTotalCompra();
//        compra.imprimiCompra();

        ValorCompraComparator valorCompraComparator = new ValorCompraComparator();
        ArrayList<Produto> testeComparator;
        testeComparator = compra.getProdutos();

        compra.imprimeListaProdutos();
        testeComparator.sort(valorCompraComparator);
        compra.imprimeListaProdutos();

        }
    }



    class ValorCompraComparator implements Comparator<Produto>{

        @Override
        public int compare(Produto produto1, Produto produto2) {
            return Double.compare(produto1.getValor(), produto2.getValor());

        }
    }
//}
