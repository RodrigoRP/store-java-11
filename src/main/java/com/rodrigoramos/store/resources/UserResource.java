package com.rodrigoramos.store.resources;

import com.rodrigoramos.store.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping(value = "/")
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "terra@terra", "1231", "123");
        return ResponseEntity.ok().body(u);
    }

}
