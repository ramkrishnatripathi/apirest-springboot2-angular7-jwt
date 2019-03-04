package org.mjavint.backend.domain.services;

import java.util.List;

import org.mjavint.backend.domain.models.User;

/**
 * UserService
 */
public interface UserService {

    User save(User user);

    List<User> findAllUsers();

    User findByEmailIgnoreCase(String email);

}