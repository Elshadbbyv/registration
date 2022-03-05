package az.iktlab.mapper;

import az.iktlab.dao.entity.UserEntity;
import az.iktlab.model.User;

public class UserMapper {

    public static UserEntity mapToEntity(User user) {
        UserEntity entity = new UserEntity();

        entity.setUsername(user.getUsername());
        entity.setPassword(user.getPassword());
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
        entity.setAge(user.getAge());
        entity.setGender(user.getGender());

        return entity;
    }
}
