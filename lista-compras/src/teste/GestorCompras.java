package teste;

import modelo.Cliente;
import modelo.Compra;
import modelo.Produto;

import java.util.*;

public class GestorCompras {

    public static void main(String[] args) {

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

        compra.removerProduto("0001");


        compra.calculaTotalCompra();
        compra.imprimiCompra();










    }
}
