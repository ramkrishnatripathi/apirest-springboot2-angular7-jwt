package org.mjavint.backend.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.mjavint.backend.models.User;

/**
 * JwtUserFactory
 */
public class JwtUserFactory {

    public static JwtUser create(User user) {
        return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), user, mapToGrantedAuthorities(
                new ArrayList<String>(Arrays.asList(String.format("ROLE_'${%s}'", user.getRole())))), false);
    }

}