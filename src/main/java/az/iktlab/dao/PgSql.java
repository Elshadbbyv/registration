package az.iktlab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PgSql implements JdbcConnection {

    private final String url = "jdbc:postgresql://localhost:5432/group_j4";
    private final String user = "postgres";
    private final String pass = "root1234";

    @Override
    public Statement getStatement() throws SQLException {
        Connection con = DriverManager.getConnection(url,user,pass);
        return con.createStatement();
    }
}
