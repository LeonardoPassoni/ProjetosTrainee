package modelo;

import org.postgresql.ds.PGConnectionPoolDataSource;
import org.postgresql.ds.PGPoolingDataSource;
import javax.sql.ConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    private static ConnectionPoolDataSource dataSource;
    private static Connection connection;
    private static void  createConnectionPool(){
        PGConnectionPoolDataSource poolDataSource = new PGConnectionPoolDataSource();
        poolDataSource.setUrl("jdbc:postgresql://localhost:5432/loja_virtual");
        poolDataSource.setUser("postgres");
        poolDataSource.setPassword("senha1");
        dataSource = poolDataSource;


    }

    public static Connection obterConexao() throws SQLException {
//        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/loja_virtual",
//                "postgres" ,"senha1");

        if(dataSource == null){
            createConnectionPool();
        }

        if(connection == null || connection.isClosed()){
            connection = dataSource.getPooledConnection().getConnection();
        }

        return connection;

    }
}
