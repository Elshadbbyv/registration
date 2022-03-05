package az.iktlab.service;

import az.iktlab.dao.entity.UserEntity;
import az.iktlab.dao.repo.UserDao;
import az.iktlab.mapper.UserMapper;
import az.iktlab.model.User;

import java.sql.SQLException;

public class UserService {
    private final UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public void registerUser(User user){
        UserEntity entity = UserMapper.mapToEntity(user);


        try {
            dao.register(entity);
            System.out.println("Registration completed successfully");
        } catch (SQLException e) {
            System.out.println("An error occurred while the user was registering.");
            System.out.printf("Error message is: %s",e.getMessage());
            e.printStackTrace();
        }

    }
}
