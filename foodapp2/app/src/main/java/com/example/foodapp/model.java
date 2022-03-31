package com.example.foodapp;

import android.view.View;

public class model {
    String image;
    String price;
    String name;
    String desc;


    public model(String image, String price, String name ,String desc) {
        this.image = image;
        this.price = price;
        this.name = name;

        this.desc=desc;

    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }




    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
