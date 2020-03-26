package com.hust25.wishbottle.service;

import com.hust25.wishbottle.entity.User;

public interface UserService {

    public User adduser(User user);

    public User findUserById(String id);

}
