package com.mkyong.service;

import com.mkyong.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User findByEmail(String email);
    User create(User user);


}
