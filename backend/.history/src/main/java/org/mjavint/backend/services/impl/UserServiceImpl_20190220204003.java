package org.mjavint.backend.services.impl;

import java.util.Date;

import org.mjavint.backend.models.User;
import org.mjavint.backend.repositories.UserRepository;
import org.mjavint.backend.services.UserService;
import org.mjavint.backend.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserServiceImpl
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        String password = PasswordUtil.getPasswordHash(user.getPassword());
        user.setPassword(password);
        user.setCreated(new Date());
        return userRepository.save(user);
    }

}