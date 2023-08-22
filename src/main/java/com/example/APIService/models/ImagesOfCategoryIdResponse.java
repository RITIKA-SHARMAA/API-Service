package com.example.APIService.models;

import com.example.APIService.repo.pojo.CategoryImagePojo;

import java.util.ArrayList;
import java.util.List;

public class ImagesOfCategoryIdResponse {

    List<CategoryImagePojo> imageList;

    public ImagesOfCategoryIdResponse(List<CategoryImagePojo> resposeAL) {
        this.imageList = resposeAL;

    }

    public List<CategoryImagePojo> getImageList() {
        return imageList;
    }

    public void setImageList(List<CategoryImagePojo> imageList) {
        this.imageList = imageList;
    }
}
