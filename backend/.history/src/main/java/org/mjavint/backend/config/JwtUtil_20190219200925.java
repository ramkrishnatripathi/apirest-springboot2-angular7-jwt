package org.mjavint.backend.config;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * JwtUtil
 */
@Component
public class JwtUtil implements Serializable {

    public String getUsernameFromToken(String authToken) {
        return null;
    }

}