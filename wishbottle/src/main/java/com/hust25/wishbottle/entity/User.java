package com.hust25.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class User {

    /**
     * 用户id，作为主键
     */
    @Id
    @Column
    private String id;

    /**
     * 用户昵称，不能为空
     */
    @Column
    @NotNull
    private String username;

    /**
     * 用户头像地址，不能为空
     */
    @Column
    @NotNull
    private String avatarUrl;

    /**
     * 注册时间，不能为空
     */
    @Column
    @NotNull
    private Date time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
