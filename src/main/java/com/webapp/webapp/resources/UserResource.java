package com.webapp.webapp.resources;

import com.webapp.webapp.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserResource {

    @GetMapping
    public ResponseEntity<User>findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "111111", "123456");
        return ResponseEntity.ok().body(u);
    }
}
