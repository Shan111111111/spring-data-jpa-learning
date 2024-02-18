package com.shantesh.springdatajpalearning;

import com.shantesh.springdatajpalearning.entity.User;
import com.shantesh.springdatajpalearning.service.UserDAOService;
import com.shantesh.springdatajpalearning.springjpatype.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jpa interface login one jack and Jones", "mikeee");
        userRepository.save(user);
        log.info("New user is created:-" + user);

        Optional<User> userWithId1 = userRepository.findById(2L);
        log.info("User is retrieved: " + userWithId1);

        List<User> usersList = userRepository.findAll();
        log.info("all users :" + usersList);

    }
}
