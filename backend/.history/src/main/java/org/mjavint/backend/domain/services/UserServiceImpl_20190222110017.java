package org.mjavint.backend.services;

import java.util.Date;
import java.util.List;

import org.mjavint.backend.models.User;
import org.mjavint.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

    @Autowired
    private BCryptPasswordEncoder encoderPassword;

    @Override
    public User save(User user) {
        String password = encoderPassword.encode(user.getPassword());
        user.setPassword(password);
        user.setCreated(new Date());
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmailIgnoreCase(email);
    }

}