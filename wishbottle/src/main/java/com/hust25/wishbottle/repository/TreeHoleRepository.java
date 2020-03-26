package com.hust25.wishbottle.repository;

import com.hust25.wishbottle.entity.TreeHole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreeHoleRepository extends JpaRepository<TreeHole, String> {

    /**
     * 查找自己所有发布的树洞
     * @param writerid
     * @return
     */
    @Query(value = "select *from tree_hole where writerid=?", nativeQuery = true)
    public List<TreeHole> findAllByWriterid(String writerid);

    /**
     * 删除树洞
     *
     * @param id
     * @return
     */
    @Modifying
    @Query(value = "update tree_hole set status=1 where id=?", nativeQuery = true)
    public int deleteTreeHoleById(String id);

    /**
     * 查看所有公开树洞
     *
     * @return
     */
    @Query(value = "select *from tree_hole where type=1", nativeQuery = true)
    public List<TreeHole> findTreeHole();
}
