package org.mjavint.backend.domain.services;

import java.util.Date;
import java.util.List;

import org.mjavint.backend.domain.models.User;
import org.mjavint.backend.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserServiceImpl
 */
@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder encoderPassword;

    @Override
    public User saveUser(User user) {
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

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

}