package com.amath.knowyourlagos.Modal;

public class Food {

    private String nameFood,descriptionFood,locationFood,contactFood;
    private int imageFood,imageTwoFood;

    public Food(String nameFood, String descriptionFood, String locationFood, String contactFood, int imageFood, int imageTwoFood) {
        this.nameFood = nameFood;
        this.descriptionFood = descriptionFood;
        this.locationFood = locationFood;
        this.contactFood = contactFood;
        this.imageFood = imageFood;
        this.imageTwoFood = imageTwoFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getDescriptionFood() {
        return descriptionFood;
    }

    public void setDescriptionFood(String descriptionFood) {
        this.descriptionFood = descriptionFood;
    }

    public String getLocationFood() {
        return locationFood;
    }

    public void setLocationFood(String locationFood) {
        this.locationFood = locationFood;
    }

    public String getContactFood() {
        return contactFood;
    }

    public void setContactFood(String contactFood) {
        this.contactFood = contactFood;
    }

    public int getImageFood() {
        return imageFood;
    }

    public void setImageFood(int imageFood) {
        this.imageFood = imageFood;
    }

    public int getImageTwoFood() {
        return imageTwoFood;
    }

    public void setImageTwoFood(int imageTwoFood) {
        this.imageTwoFood = imageTwoFood;
    }
}
