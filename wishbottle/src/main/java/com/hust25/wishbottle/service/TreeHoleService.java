package com.hust25.wishbottle.service;

import com.hust25.wishbottle.entity.TreeHole;

import java.util.List;

public interface TreeHoleService {

    /**
     * 查找自己发布的树洞
     *
     * @param writerid
     * @return
     */
    public List<TreeHole> findAllByWriterid(String writerid);

    /**
     * 删除树洞
     *
     * @param id
     * @return
     */
    public int deleteTreeHoleById(String id);

    /**
     * 查看所有公开树洞
     *
     * @return
     */
    public List<TreeHole> findTreeHole();

    /**
     * 添加树洞
     * @param treeHole
     * @return
     */
    public TreeHole addTreeHole(TreeHole treeHole);

}
