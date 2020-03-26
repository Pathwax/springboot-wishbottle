package com.hust25.wishbottle.repository;

import com.hust25.wishbottle.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager,String> {
}
