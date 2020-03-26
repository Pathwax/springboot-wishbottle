package com.hust25.wishbottle.service;

import com.hust25.wishbottle.entity.WishBottle;

import java.util.List;

public interface WishBottleService {


    /**
     * 查找所有丢出的瓶子
     *
     * @param writerid
     * @return
     */
    public List<WishBottle> findAllByWriterid(String writerid);


    /**
     * 查找所有回复
     *
     * @param receiverid
     * @return
     */
    public List<WishBottle> findAllByReceiverid(String receiverid);


    /**
     * 扔瓶子
     *
     * @param wishBottle
     * @return
     */
    public WishBottle addWishBottle(WishBottle wishBottle);

    /**
     * 捞瓶子
     *
     * @return
     */
    public WishBottle getWishBottle(String writerid);

}
