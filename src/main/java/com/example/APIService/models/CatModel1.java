package com.example.APIService.models;

public class CatModel1 {

    String name; String imgURL; String createdBy; int id;

    public CatModel1(String name, String imgURL, String createdBy, int id) {
        this.name = name;
        this.imgURL = imgURL;
        this.createdBy = createdBy;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
