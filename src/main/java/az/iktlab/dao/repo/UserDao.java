package az.iktlab.dao.repo;

import az.iktlab.dao.entity.UserEntity;
import az.iktlab.dao.PgSql;
import az.iktlab.util.SqlQuery;

import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {

    PgSql pgSql = new PgSql();
    public void register(UserEntity user) throws SQLException {
        Statement stmt = pgSql.getStatement();
        stmt.execute(SqlQuery.insertUser(user));
    }
}
