package org.mjavint.backend.controllers;

import org.mjavint.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * PreLoginController 
 */
@RestController
public class PreLoginController {
    @Autowired
    private UserService userService;

    public ResponseEntity<Response>
}