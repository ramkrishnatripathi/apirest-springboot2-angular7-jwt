package org.mjavint.backend.config;

import org.mjavint.backend.models.User;

/**
 * JwtUserFactory
 */
public class JwtUserFactory {

    public static JwtUser create(User user) {
        return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), user, mapToGrantedAuthorities(new ArrayList), false);
    }

}