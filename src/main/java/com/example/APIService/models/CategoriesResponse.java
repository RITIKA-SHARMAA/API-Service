package com.example.APIService.models;

import com.example.APIService.repo.pojo.CategoryPojo;

import java.util.ArrayList;
import java.util.List;

public class CategoriesResponse {
    List<CategoryPojo> catModelArrayList;

    public CategoriesResponse(List<CategoryPojo> catModelArrayList) {
        this.catModelArrayList = catModelArrayList;
    }

    public List<CategoryPojo> getCatModelArrayList() {
        return catModelArrayList;
    }

    public void setCatModelArrayList(List<CategoryPojo> catModelArrayList) {
        this.catModelArrayList = catModelArrayList;
    }
}
