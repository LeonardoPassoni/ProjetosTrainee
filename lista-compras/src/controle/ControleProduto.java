package controle;

import modelo.Produto;

import java.util.ArrayList;

public class ControleProduto {

    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void cadastrarProduto(){

        Produto produto = new Produto();
        produto.cadastrarProduto("abc","abc",200);
        produtos.add(produto);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
