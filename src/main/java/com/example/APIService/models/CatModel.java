package com.example.APIService.models;

public class CatModel {

    private String categoryName ;
    private String thumbnailImageUrl;
    private int id;


    public CatModel(String name, String imageUrl, int id){
        this.categoryName = name;
        this.thumbnailImageUrl = imageUrl;
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public void setThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
