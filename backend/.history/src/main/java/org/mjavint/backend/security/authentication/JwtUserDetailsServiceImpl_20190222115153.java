
package org.mjavint.backend.security.authentication;

import org.mjavint.backend.domain.models.User;
import org.mjavint.backend.domain.repositories.UserRepository;
import org.mjavint.backend.security.utils.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * JwtUserDetailsServiceImpl
 */
@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmailIgnoreCase(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No User found with username '%s'.", username));
        } else {
            return JwtUserFactory.create(user);
        }
    }

}