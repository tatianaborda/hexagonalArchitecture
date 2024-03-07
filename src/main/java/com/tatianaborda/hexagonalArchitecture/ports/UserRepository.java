package com.tatianaborda.hexagonalArchitecture.ports;

import com.tatianaborda.hexagonalArchitecture.domain.User;

import java.util.List;

public interface UserRepository {

    void createUser(User user);

    User getUserById(long userId);

    List<User> getAllUsers();

    void updateUser(int userId, User user);

    void deleteUser(int userId);

}
