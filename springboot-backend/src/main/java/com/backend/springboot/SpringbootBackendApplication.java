package com.backend.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backend.springboot.model.User;
import com.backend.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String...args) throws Exception {
<<<<<<< HEAD
        this.userRepository.save(new User("Ramesh", "Fadatare", "ramesh@gmail.com"));
=======
        this.userRepository.save(new User("Ismail", "Shaikh", "ismail@gmail.com"));
>>>>>>> 95e3ba1 (Springboot & Angular changes)
        this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
        this.userRepository.save(new User("Tony", "Stark", "tony@gmail.com"));
    }
}
