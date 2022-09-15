package dao;

import modelo.ConnectionFactory;
import modelo.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvar(Produto produto) throws SQLException {
        String sql = "INSERT INTO PRODUTO (NOME,DESCRICAO) VALUES(?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement
                (sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.execute();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                resultSet.next();
                produto.setId(resultSet.getInt("id" ));
                System.out.println("Produto inserido: " + produto);

            }
        }


    }

    public List<Produto> listar() throws SQLException {
        List<Produto> produtos = new ArrayList<>();

        String sql = "SELECT ID,NOME,DESCRICAO FROM PRODUTO";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.execute();

            try (ResultSet resultSet = preparedStatement.getResultSet()) {
                while (resultSet.next()) {
                    Produto produto = new Produto(
                            resultSet.getInt("id" ),
                            resultSet.getString("nome" ),
                            resultSet.getString("descricao" ));

                    produtos.add(produto);
                }
            }


        }
        return produtos;
    }


    public boolean remover(int id) throws SQLException {
        String sql = "DELETE FROM PRODUTO WHERE ID = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement((sql),
                PreparedStatement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                if (resultSet.next()){
                    return true;
                }
            }

        }
        return false;
    }

    public  void alterarNome(int id, String novoNome) throws SQLException{
        String sql = "UPDATE PRODUTO SET NOME = ? WHERE ID = ?";

        try(PreparedStatement preparedStatement = ConnectionFactory.obterConexao().prepareStatement(sql)){
            preparedStatement.setString(1,novoNome);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
        }
    }

    public  void alterarDescricao(int id, String novaDescricao) throws SQLException{
        String sql = "UPDATE PRODUTO SET DESCRICAO = ? WHERE ID = ?";

        try(PreparedStatement preparedStatement = ConnectionFactory.obterConexao().prepareStatement(sql)){
            preparedStatement.setString(1,novaDescricao);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
        }
    }
}
