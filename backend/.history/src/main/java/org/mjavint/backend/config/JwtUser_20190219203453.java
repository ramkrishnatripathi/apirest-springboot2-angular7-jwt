package org.mjavint.backend.config;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * JwtUser
 */
public class JwtUser implements UserDetails {
    private final Long id;
    private final String username;
    private final String password;

}