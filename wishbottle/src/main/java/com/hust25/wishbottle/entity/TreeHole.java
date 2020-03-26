package com.hust25.wishbottle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class TreeHole {

    /**
     * 树洞id，作为主键
     */
    @Id
    @Column
    private Integer id;

    /**
     * 树洞作者id，非空
     */
    @Column
    @NotNull
    private Integer writerid;

    /**
     * 该树洞的发表时间，非空
     */
    @Column
    @NotNull
    private Date treetime;

    /**
     * 树洞的文本内容
     */
    @Column
    @NotNull
    private String content = "";

    /**
     * 树洞状态 0-未删除，1-已删除
     */
    @Column
    @NotNull
    private Integer status = 0;

    /**
     * 树洞类型 0-私人树洞 1-公开树洞
     *
     * @return
     */
    @Column
    @NotNull
    private Integer type = 1;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWriterid() {
        return writerid;
    }

    public void setWriterid(Integer writerid) {
        this.writerid = writerid;
    }

    public Date getTreetime() {
        return treetime;
    }

    public void setTreetime(Date treetime) {
        this.treetime = treetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
