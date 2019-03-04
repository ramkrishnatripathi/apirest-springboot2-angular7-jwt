package org.mjavint.backend.controllers;

import org.mjavint.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
}