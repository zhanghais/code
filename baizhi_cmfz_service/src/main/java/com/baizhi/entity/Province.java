package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
public class Province implements Serializable{
    private String id;
    private String code;
    private String name;

    @Override
    public String toString() {
        return "Province{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province(String id, String code, String name) {

        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Province() {
        super();
    }
}
