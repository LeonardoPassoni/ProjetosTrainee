package padrao;

import dao.ProdutoDAO;
import modelo.ConnectionFactory;
import modelo.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaDAO {


    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.obterConexao();
        Produto produto = new Produto("Teste1","ABCDE");

        ProdutoDAO produtoDAO = new ProdutoDAO(connection);

        produtoDAO.salvar(produto);
        produtoDAO.alterarNome(68,"Teste456789");
        produtoDAO.alterarDescricao(68,"AAAAAAAAA");

        System.out.println("Produto foi removido?" +  produtoDAO.remover(66));


        List<Produto> produtos = produtoDAO.listar();
        produtos.forEach(System.out::println);
    }
}
