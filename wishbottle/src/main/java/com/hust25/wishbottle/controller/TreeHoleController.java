package com.hust25.wishbottle.controller;

import com.hust25.wishbottle.entity.TreeHole;
import com.hust25.wishbottle.service.TreeHoleService;
import com.hust25.wishbottle.util.DataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/treehole")
public class TreeHoleController {

    @Autowired
    TreeHoleService treeHoleService;

    /**
     * 查找自己发布的树洞
     *
     * @param writerId
     * @return
     */
    @RequestMapping("/findmine")
    public DataModel findAllMine(String writerId) {
        DataModel dataModel = new DataModel();
        try {
            dataModel.setData(treeHoleService.findAllByWriterid(writerId));
        } catch (Exception e) {
            dataModel.setData(500);
            dataModel.setErrormsg("接口调用失败");
        }
        return dataModel;
    }

    /**
     * 删除树洞
     *
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public DataModel deleteById(String id) {
        DataModel dataModel = new DataModel();
        try {
            dataModel.setData(treeHoleService.deleteTreeHoleById(id));
        } catch (Exception e) {
            dataModel.setCode(500);
            dataModel.setErrormsg("接口调用失败");
        }
        return dataModel;
    }

    /**
     * 查看所有公开树洞
     *
     * @return
     */
    @RequestMapping("/findall")
    public DataModel findAllTreeHole() {
        DataModel dataModel = new DataModel();
        try {
            dataModel.setData(treeHoleService.findTreeHole());
        } catch (Exception e) {
            dataModel.setCode(500);
            dataModel.setErrormsg("接口调用失败");
        }
        return dataModel;
    }

    /**
     * 添加树洞
     *
     * @param treeHole
     * @return
     */
    @RequestMapping("添加树洞")
    public DataModel addTreeHole(TreeHole treeHole) {
        DataModel dataModel = new DataModel();
        try {
            dataModel.setData(treeHoleService.addTreeHole(treeHole));
        } catch (Exception e) {
            dataModel.setCode(500);
            dataModel.setErrormsg("接口调用失败");
        }
        return dataModel;
    }
}
