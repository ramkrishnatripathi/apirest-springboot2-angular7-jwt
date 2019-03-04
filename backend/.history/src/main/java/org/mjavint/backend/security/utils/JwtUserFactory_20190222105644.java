package org.mjavint.backend.security.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.mjavint.backend.models.User;
import org.mjavint.backend.security.authentication.JwtUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * JwtUserFactory
 */
public class JwtUserFactory {

    public static JwtUser create(User user) {
        return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), user,
                mapToGrantedAuthorities(
                        new ArrayList<String>(Arrays.asList(String.format("ROLE_'${%s}'", user.getRole())))),
                user.isEnabled());
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities) {
        return authorities.stream().map(Authority -> new SimpleGrantedAuthority(Authority))
                .collect(Collectors.toList());
    }

}