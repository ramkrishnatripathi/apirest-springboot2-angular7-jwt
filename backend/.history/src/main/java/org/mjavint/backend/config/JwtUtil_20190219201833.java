package org.mjavint.backend.config;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

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
    private Long expiration;

    public String getUsernameFromToken(String token) {
        String username = null;
        try {
            final Claims claims = getClaimsFromToken(token);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    private Claims getClaimsFromToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            // TODO: handle exception
            claims = null;
        }
        return null;
    }

}