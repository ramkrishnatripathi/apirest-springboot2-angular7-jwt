package org.mjavint.backend.config;

import java.util.Collection;

import org.mjavint.backend.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * JwtUser
 */
@Getter
@Setter
@AllArgsConstructor
public class JwtUser implements UserDetails {
    private final Long id;
    private final String username;
    private final String password;
    private final User user;
    private final Collection<? extends GrantedAuthority> autorities;
    private final boolean enabled;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

}