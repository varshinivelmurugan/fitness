package com.example.yoga.Model;

public class Exercise {
    int image_id;
    String name;


    public Exercise(int image_id, String name) {

        this.image_id = image_id;
        this.name = name;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
