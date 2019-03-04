package org.mjavint.backend.security.authentication;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    private static final long serialVersionUID = 4985040367254923061L;
    private final Long id;
    private final String username;
    private final String password;
    private final User user;
    private final Collection<? extends GrantedAuthority> autorities;
    private final boolean enabled;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return autorities;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

}