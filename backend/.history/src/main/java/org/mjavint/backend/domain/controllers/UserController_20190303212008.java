package org.mjavint.backend.domain.controllers;

import java.security.Principal;
import java.util.List;

import org.mjavint.backend.domain.models.User;
import org.mjavint.backend.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@CrossOrigin(allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    // @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @GetMapping(value = "/user")
    // @PreAuthorize("hasRole('USER')")
    public ResponseEntity<User> getUserByEmail(Principal principal) {
        User user = userService.getUserByEmail(principal.getName());
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @GetMapping(value = "/user/{id}")
    // @PreAuthorize("hasRole('USER')")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PostMapping(value = "/user")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        userService.saveUser(user);
        return new ResponseEntity<String>("User created successfully", HttpStatus.CREATED);
    }

}