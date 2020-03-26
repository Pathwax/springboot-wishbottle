package com.hust25.wishbottle.service.serviceImpl;

import com.hust25.wishbottle.repository.TreeHoleRepository;
import com.hust25.wishbottle.entity.TreeHole;
import com.hust25.wishbottle.service.TreeHoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TreeHoleServiceImpl implements TreeHoleService {

    @Autowired
    TreeHoleRepository treeHoleRepository;

    @Override
    public List<TreeHole> findAllByWriterid(String writerid) {
        return treeHoleRepository.findAllByWriterid(writerid);
    }

    @Override
    public int deleteTreeHoleById(String id) {
        return treeHoleRepository.deleteTreeHoleById(id);
    }

    @Override
    public List<TreeHole> findTreeHole() {
        return treeHoleRepository.findTreeHole();
    }

    @Override
    public TreeHole addTreeHole(TreeHole treeHole) {
        return treeHoleRepository.saveAndFlush(treeHole);
    }
}
