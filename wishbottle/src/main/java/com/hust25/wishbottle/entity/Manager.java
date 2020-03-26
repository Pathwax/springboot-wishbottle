package com.hust25.wishbottle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Manager  {

    /**
     * 管理员id，主键
     */
    @Id
    @Column
    private String id;

    /**
     * 管理员用户名
     */
    @Column
    @NotNull
    private String username;

    /**
     * 管理员密码
     */
    @Column
    @NotNull
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
