package org.mjavint.backend.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * AuthenticationController
 */
@RestController
public class AuthenticationController {

    @Value("${jwt.header}")
    private String tokenHeader;

}