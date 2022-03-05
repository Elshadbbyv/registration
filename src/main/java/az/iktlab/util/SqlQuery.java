package az.iktlab.util;

import az.iktlab.dao.entity.UserEntity;

public class SqlQuery {
    public static String insertUser(UserEntity user){
        return String.format("INSERT INTO j4_sc.user (" +
                "username, password,firstname, lastname, age, gender)\n" +
                "VALUES ('%s','%s','%s','%S',%s,'%S')",
                user.getUsername(),
                user.getPassword(),
                user.getFirstName(),
                user.getLastName(),
                user.getAge(),
                user.getGender());

    }
}
