package com.example.dip.model;

public class Course {

    int id;
    String img, title, fak, level, color;

    public Course(int id, String img, String title, String fak, String level, String color) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.fak = fak;
        this.level = level;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFak() {
        return fak;
    }

    public void setFak(String fak) {
        this.fak = fak;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
