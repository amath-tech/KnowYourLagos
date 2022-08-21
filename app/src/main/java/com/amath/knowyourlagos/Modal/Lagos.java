package com.amath.knowyourlagos.Modal;

public class Lagos {

    private String name;
    private int image;
    private String description;

    public Lagos(int image,String name,String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
