package padrao;

import modelo.ConnectionFactory;
import modelo.Produto;

import java.sql.*;

public class TestaListagem {

    public static void main(String[] args) throws SQLException {


//        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/loja_virtual",
//                "postgres" ,"senha1");

       // Connection connection = CriaConexao.obterConexao();

        Statement stm = ConnectionFactory.obterConexao().createStatement();

        stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

        ResultSet rst = stm.getResultSet();


        while (rst.next()){
            Produto produto = new Produto(rst.getInt("ID"),
                    rst.getString("NOME"),
                    rst.getString("DESCRICAO")) ;
//            produto.setId(rst.getInt("ID"));
//            produto.setNome(rst.getString("NOME"));
//            produto.setDescricao(rst.getString("DESCRICAO"));

            System.out.println(produto);
        }



        //connection.close();

    }
}
