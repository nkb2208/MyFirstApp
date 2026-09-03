package com.example.myfirstapp;

public class Car {
    private String id;
    private String nameCar;

    private int image;


    public Car(String id, String nameCar, int image){
        this.id = id;
        this.nameCar= nameCar;
        this.image = image;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
