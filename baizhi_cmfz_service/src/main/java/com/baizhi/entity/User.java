package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
public class User implements Serializable{
    private String id;
    private String name;
    private String farmington;
    private String nickname;
    private String photo;
    private String location;
    private Province province;
    private City city;
    private String description;
    private String phone;
    private String passowrd;
    private String salt;
    private String sex;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", farmington='" + farmington + '\'' +
                ", nickname='" + nickname + '\'' +
                ", photo='" + photo + '\'' +
                ", location='" + location + '\'' +
                ", province=" + province +
                ", city=" + city +
                ", description='" + description + '\'' +
                ", phone='" + phone + '\'' +
                ", passowrd='" + passowrd + '\'' +
                ", salt='" + salt + '\'' +
                ", sex='" + sex + '\'' +
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

    public String getFarmington() {
        return farmington;
    }

    public void setFarmington(String farmington) {
        this.farmington = farmington;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User(String id, String name, String farmington, String nickname, String photo, String location, Province province, City city, String description, String phone, String passowrd, String salt, String sex) {

        this.id = id;
        this.name = name;
        this.farmington = farmington;
        this.nickname = nickname;
        this.photo = photo;
        this.location = location;
        this.province = province;
        this.city = city;
        this.description = description;
        this.phone = phone;
        this.passowrd = passowrd;
        this.salt = salt;
        this.sex = sex;
    }

    public User() {
        super();
    }
}
