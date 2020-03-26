package com.hust25.wishbottle.repository;

import com.hust25.wishbottle.entity.WishBottle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishBottleRepository extends JpaRepository<WishBottle, String> {

    /**
     * 查找公开树洞
     *
     * @param writerid
     * @return
     */
    @Query(value = "select *from wish_bottle where writerid=?", nativeQuery = true)
    public List<WishBottle> findAllByWriterid(String writerid);

    /**
     * 查找所有回复
     *
     * @param receiverid
     * @return
     */
    @Query(value = "select *from wish_bottle where receiverid=?", nativeQuery = true)
    public List<WishBottle> findAllByReceiverid(String receiverid);



    /**
     * 随机获取心愿瓶
     *
     * @param writerid
     * @return
     */
    @Query(value = "select *from wish_bottle where writerid IS NOT ? order by rand() limit 1", nativeQuery = true)
    List<WishBottle> getRandWish(String writerid);

}
