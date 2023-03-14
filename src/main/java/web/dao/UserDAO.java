package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    List<User> getAllUser();

    User getById(int id);
}
