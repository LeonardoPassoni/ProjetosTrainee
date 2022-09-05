package teste;

import controle.ControleProduto;
import modelo.Compra;
import modelo.Produto;

public class Menu {

    ControleProduto controleProduto = new ControleProduto();

    public void  iniciarMenu(){
        int opcao = 1;


        System.out.println("Menu Opcoes");
        System.out.println("1 - Cadastrar Produtos");
        System.out.println("2 - Cadastrar Clientes");
        System.out.println("3 - Cadastrar Compras");

        switch (opcao){

            case 1 :
                Produto produto = new Produto();
               controleProduto.cadastrarProduto();

            case 2 :

            case 3 :
        }


    }


    public void menuProdutos(){
        int opcao = 1;
        System.out.println("1 - Adicionar Produtos");
        System.out.println("2 - Remover  Produtos");

        switch (opcao){

            case 1 :
            case 2 :

        }

    }
}
