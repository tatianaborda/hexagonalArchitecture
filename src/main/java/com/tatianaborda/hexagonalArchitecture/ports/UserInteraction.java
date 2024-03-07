package com.tatianaborda.hexagonalArchitecture.ports;

import com.tatianaborda.hexagonalArchitecture.domain.User;

import java.util.List;

public interface UserInteraction {

    void displayUser(User user);

    void displayAllUsers(List<User> users);

}
