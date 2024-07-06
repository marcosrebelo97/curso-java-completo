package com.webservices.secao12.resources;

import com.webservices.secao12.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Marcos", "marcos@gmail.com", "99999", "12134");
        return ResponseEntity.ok().body(u);
    }
}