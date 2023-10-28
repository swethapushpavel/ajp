package ex3.pm.service;
import java.util.List;
import java.util.Optional;

import ex3.pm.user.User;

public interface UserService {
    List<User> getAll();
    void deleteUser(long id);
    void addUser(User user);
    void updateUser(long id, User user);
    Optional<User> getUserById(long id);
}