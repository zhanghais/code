package com.baizhi.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public class Wen {
    private String id;
    private String thumbnail;
    private int score;
    private String author;
    private String broadscast;
    private int count;
    private String breif;
    private Date createDate;

    @Override
    public String toString() {
        return "Wen{" +
                "id='" + id + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", score=" + score +
                ", author='" + author + '\'' +
                ", broadscast='" + broadscast + '\'' +
                ", count=" + count +
                ", breif='" + breif + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBroadscast() {
        return broadscast;
    }

    public void setBroadscast(String broadscast) {
        this.broadscast = broadscast;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBreif() {
        return breif;
    }

    public void setBreif(String breif) {
        this.breif = breif;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Wen(String id, String thumbnail, int score, String author, String broadscast, int count, String breif, Date createDate) {

        this.id = id;
        this.thumbnail = thumbnail;
        this.score = score;
        this.author = author;
        this.broadscast = broadscast;
        this.count = count;
        this.breif = breif;
        this.createDate = createDate;
    }

    public Wen() {
        super();
    }
}
