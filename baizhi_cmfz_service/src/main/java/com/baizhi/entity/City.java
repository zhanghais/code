package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
public class City implements Serializable {
    private String id;
    private String code;
    private String name;
    private Province province;

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", province=" + province +
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

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public City(String id, String code, String name, Province province) {

        this.id = id;
        this.code = code;
        this.name = name;
        this.province = province;
    }

    public City() {
        super();
    }
}
