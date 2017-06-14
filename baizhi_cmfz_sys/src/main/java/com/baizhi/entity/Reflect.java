package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * Created by Administrator on 2017/6/13 0013.
 */
public class Reflect implements Serializable{
    private String id;
    private String description;
    private Date date;
    private User user;
    public Reflect() {
        super();
    }
    @Override
    public String toString() {
        return "Reflect{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", user=" + user +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Reflect(String id, String description, Date date, User user) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.user = user;
    }
}
