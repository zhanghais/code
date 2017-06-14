package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public class Chapter implements Serializable {
    private String id;
    private String title;
    private String download;
    private String size;
    private Wen wen;
    @Override
    public String toString() {
        return "Chapter{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", download='" + download + '\'' +
                ", size='" + size + '\'' +
                ", wen=" + wen +
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

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Wen getWen() {
        return wen;
    }

    public void setWen(Wen wen) {
        this.wen = wen;
    }

    public Chapter(String id, String title, String download, String size, Wen wen) {

        this.id = id;
        this.title = title;
        this.download = download;
        this.size = size;
        this.wen = wen;
    }

    public Chapter() {
        super();
    }
}
