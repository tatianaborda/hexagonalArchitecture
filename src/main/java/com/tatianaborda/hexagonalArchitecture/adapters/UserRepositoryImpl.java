package com.tatianaborda.hexagonalArchitecture.adapters;

import com.tatianaborda.hexagonalArchitecture.domain.User;
import com.tatianaborda.hexagonalArchitecture.ports.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private List<User> users = new ArrayList<>();

    @Override
    public void createUser(User user) {
        users.add(user);
    }

    @Override
    public User getUserById(long userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    @Override
    public void updateUser(int userId, User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == userId) {
                users.set(i, user);
                return;
            }
        }
    }

    @Override
    public void deleteUser(int userId) {
        users.removeIf(user -> user.getId() == userId);
    }
}
