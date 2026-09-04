package com.example.myfirstapp;

public class Language {
    private String id;
    private String languageName;
    private int image;


    public Language(String id, String languageName, int image){
        this.id = id;
        this.languageName = languageName;
        this.image = image;
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

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}
