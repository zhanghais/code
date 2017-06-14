package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public class Si implements Serializable {
    private String id;
    private String title;
    private String name;
    @JSONField(format = "yyyy-MM-dd")
    private Date date;
    private String type;
    private String path;
    private String txt;
    @Override
    public String toString() {
        return "Si{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", path='" + path + '\'' +
                ", txt='" + txt + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Si(String id, String title, String name, Date date, String type, String path, String txt) {

        this.id = id;
        this.title = title;
        this.name = name;
        this.date = date;
        this.type = type;
        this.path = path;
        this.txt = txt;
    }

    public Si() {
        super();
    }
}
