package com.example.foodapp;

public class Itemdata {
    String img;
    String name;
    String desc;
    String price;

    public Itemdata(String img, String name, String desc, String price) {
        this.img = img;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
