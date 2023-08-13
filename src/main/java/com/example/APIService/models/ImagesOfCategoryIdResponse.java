package com.example.APIService.models;

import java.util.ArrayList;

public class ImagesOfCategoryIdResponse {

    ArrayList<CatModel1> imageList;

    public ImagesOfCategoryIdResponse(ArrayList<CatModel1> resposeAL) {
        this.imageList = resposeAL;

    }

    public ArrayList<CatModel1> getImageList() {
        return imageList;
    }

    public void setImageList(ArrayList<CatModel1> imageList) {
        this.imageList = imageList;
    }
}
