package org.mjavint.backend.domain.services;

import java.util.List;

/**
 * UserService
 */
public interface UserService {

    User save(User user);

    List<User> findAllUsers();

    User getUserByEmail(String email);

}