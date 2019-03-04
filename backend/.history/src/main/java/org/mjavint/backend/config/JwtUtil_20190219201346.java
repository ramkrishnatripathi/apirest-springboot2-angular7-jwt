package org.mjavint.backend.config;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * JwtUtil
 */
@Component
public class JwtUtil implements Serializable {

    private static final long serialVersionUID = 5423286530778081502L;

    static final String KEY_USERNAME = "sub";
    static final String KEY_AUDIENCE = "audience";
    static final String KEY_CREATED = "created";

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private String expiration;

    public String getUsernameFromToken(String authToken) {
        return null;
    }

}