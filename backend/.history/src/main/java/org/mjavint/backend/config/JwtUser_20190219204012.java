package org.mjavint.backend.config;

import java.util.Collection;

import org.mjavint.backend.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;

/**
 * JwtUser
 */
@AllArgsConstructor
public class JwtUser implements UserDetails {
    private final Long id;
    private final String username;
    private final String password;
    private final User user;
    private final Collection<? extends GrantedAuthority> autorities;
    private final boolean enabled;

}