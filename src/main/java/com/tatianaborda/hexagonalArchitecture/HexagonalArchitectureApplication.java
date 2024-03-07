package com.tatianaborda.hexagonalArchitecture;

import com.tatianaborda.hexagonalArchitecture.domain.User;
import com.tatianaborda.hexagonalArchitecture.ports.UserInteraction;
import com.tatianaborda.hexagonalArchitecture.ports.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class HexagonalArchitectureApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(HexagonalArchitectureApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
		UserInteraction userInteraction = context.getBean(UserInteraction.class);

		userRepository.createUser(new User(1, "Salvatore"));
		userRepository.createUser(new User(2, "Teddy"));

		User user = userRepository.getUserById(1);
		userInteraction.displayUser(user);

		List<User> allUsers = userRepository.getAllUsers();
		userInteraction.displayAllUsers(allUsers);

	}

}
