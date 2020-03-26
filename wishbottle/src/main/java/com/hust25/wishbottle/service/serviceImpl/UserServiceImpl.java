package com.hust25.wishbottle.service.serviceImpl;

import com.hust25.wishbottle.repository.UserRepository;
import com.hust25.wishbottle.entity.User;
import com.hust25.wishbottle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User adduser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public User findUserById(String id) {
        try {
            User user = userRepository.findUserById(id);
            if (user == null) {
                return null;
            } else {
                return user;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
