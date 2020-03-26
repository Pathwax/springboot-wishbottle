package com.hust25.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class WishBottle {

    /**
     * 心愿瓶id，作为主键
     */
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column
    private int id;

    /**
     * 心愿瓶作者id，非空
     */
    @Column
    @NotNull
    private String writerid;

    /**
     * 心愿瓶接收者id，可以为空
     */
    @Column
    private String receiverid;

    /**
     * 心愿瓶发布时间
     */
    @Column
    @NotNull
    private String wishtime;


    /**
     * 心愿瓶文本内容，非空
     */
    @Column
    @NotNull
    private String content = "";

    /**
     * 用户昵称，非空
     */
    @Column
    @NotNull
    private String nickName;

    /**
     * 用户性别，非空
     */
    @Column
    @NotNull
    private int gender;

    /**
     * 用户城市，非空
     */
    @Column
    @NotNull
    private String city;

    /**
     * 图片数组，可以为空
     */
    @Column
    @ElementCollection(targetClass=String.class)
    private List<String> images;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWriterid() {
        return writerid;
    }

    public void setWriterid(String writerid) {
        this.writerid = writerid;
    }

    public String getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(String receiverid) {
        this.receiverid = receiverid;
    }

    public String getWishtime() {
        return wishtime;
    }

    public void setWishtime(String wishtime) {
        this.wishtime = wishtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
