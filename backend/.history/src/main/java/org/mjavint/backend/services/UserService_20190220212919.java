package org.mjavint.backend.services;

import java.util.List;

import org.mjavint.backend.models.User;

/**
 * UserService
 */
public interface UserService {

    User save(User user);

    List<User> findAllUsers();

}