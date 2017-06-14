package com.baizhi.entity;

import java.io.Serializable;

public class Image implements Serializable{
    private String id;
    private String description;
    private String thumbnail;

    public Image() {
        super();
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Image(String id, String description, String thumbnail) {

        this.id = id;
        this.description = description;
        this.thumbnail = thumbnail;
    }
}
