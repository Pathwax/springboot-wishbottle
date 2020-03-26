package com.hust25.wishbottle.controller;

import com.hust25.wishbottle.entity.Manager;
import com.hust25.wishbottle.service.ManagerService;
import com.hust25.wishbottle.util.DataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    /**
     * 添加管理员
     *
     * @param manager
     * @return
     */
    @RequestMapping("/addmanager")
    public DataModel addManager(Manager manager) {
        DataModel dataModel = new DataModel();
        try {
            dataModel.setData(managerService.addManager(manager));
        } catch (Exception e) {
            dataModel.setCode(500);
            dataModel.setErrormsg("接口调用失败");
        }
        return dataModel;
    }

    /**
     * 删除管理员
     *
     * @param id
     */
    @RequestMapping("/delete")
    public DataModel deleteManager(String id) {
        DataModel dataModel = new DataModel();
        try {
            dataModel.setData(managerService.deleteManager(id));
        } catch (Exception e) {
            dataModel.setCode(500);
            dataModel.setErrormsg("接口调用失败");
        }
        return dataModel;
    }
}
