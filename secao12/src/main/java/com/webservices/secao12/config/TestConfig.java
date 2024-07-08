package com.webservices.secao12.config;

import com.webservices.secao12.entities.User;
import com.webservices.secao12.repositories.UserRepository;
import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Marcos", "marcos@gmail.com", "999999", "12134");

        userRepository.save(u1);

    }
}
