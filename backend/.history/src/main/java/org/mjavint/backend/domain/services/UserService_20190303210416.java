package org.mjavint.backend.domain.services;

import java.util.List;

import org.mjavint.backend.domain.models.User;

/**
 * UserService
 */
public interface UserService {

    User saveUser(User user);

    List<User> findAllUsers();

    User getUserByEmail(String email);

}