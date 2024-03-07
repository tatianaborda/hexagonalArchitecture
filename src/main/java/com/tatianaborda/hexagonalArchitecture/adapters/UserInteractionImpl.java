package com.tatianaborda.hexagonalArchitecture.adapters;

import com.tatianaborda.hexagonalArchitecture.domain.User;
import com.tatianaborda.hexagonalArchitecture.ports.UserInteraction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserInteractionImpl implements UserInteraction {
    @Override
    public void displayUser(User user) {
        System.out.println("User: " + user.getName());
    }

    @Override
    public void displayAllUsers(List<User> users) {
        System.out.println("users list:");
        for (User user : users) {
            System.out.println("- " + user.getName());
        }
    }
}
