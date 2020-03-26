package com.hust25.wishbottle.service.serviceImpl;

import com.hust25.wishbottle.entity.Manager;
import com.hust25.wishbottle.repository.ManagerRepository;
import com.hust25.wishbottle.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    @Override
    public Manager addManager(Manager manager) {
        return managerRepository.saveAndFlush(manager);
    }

    @Override
    public int deleteManager(String id) {
        managerRepository.deleteById(id);
        return 1;
    }
}
