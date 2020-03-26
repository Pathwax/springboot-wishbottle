package com.hust25.wishbottle.service;

import com.hust25.wishbottle.entity.Manager;

public interface ManagerService {

    /**
     * 添加管理员
     *
     * @param manager
     * @return
     */
    public Manager addManager(Manager manager);

    /**
     * 删除管理员
     *
     * @param id
     */
    public int deleteManager(String id);
}
