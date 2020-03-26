package com.hust25.wishbottle.repository;

import com.hust25.wishbottle.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, String> {

    public User findUserById(String id);


}
