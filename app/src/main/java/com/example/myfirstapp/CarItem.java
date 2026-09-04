package com.example.myfirstapp;

public class CarItem {
    private int id;
    private int img;
    private String name;

    public CarItem(int id, String name, int img) {
        this.id = id;
        this.name = name;
        this.img = img;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
