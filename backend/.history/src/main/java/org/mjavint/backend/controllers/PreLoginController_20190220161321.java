package org.mjavint.backend.controllers;

import org.mjavint.backend.domain.Response;
import org.mjavint.backend.models.User;
import org.mjavint.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * PreLoginController
 */
@RestController
public class PreLoginController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Response> registration(@RequestBody User user) {
    }
}