package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
public class Count implements Serializable {
    private String id;
    private Date date;
    private String name;
    private Learn learn;
    private int count;
    private User user;

    @Override
    public String toString() {
        return "Count{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", learn=" + learn +
                ", count=" + count +
                ", user=" + user +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Learn getLearn() {
        return learn;
    }

    public void setLearn(Learn learn) {
        this.learn = learn;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Count(String id, Date date, String name, Learn learn, int count, User user) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.learn = learn;
        this.count = count;
        this.user = user;
    }

    public Count() {
        super();
    }
}
