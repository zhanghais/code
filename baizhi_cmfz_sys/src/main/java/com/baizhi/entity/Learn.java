package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public class Learn implements Serializable{
    private String id;
    private String name;
    private String type;
    private User user;

    @Override
    public String toString() {
        return "Learn{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", user=" + user +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Learn(String id, String name, String type, User user) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.user = user;
    }

    public Learn() {
        super();
    }
}
