package com.mkyong.service;

import com.mkyong.entity.User;
import com.mkyong.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findByEmail(String email) {
        return (User) userRepository.findByEmail(email);
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void remove(User user) {
        userRepository.delete(user);
    }

    @Override
    public void update(User user) {
        user.setRole("user");
        userRepository.save(user);
    }
}
