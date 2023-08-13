package com.example.APIService.models;

import java.util.ArrayList;

public class CategoriesResponse {
    ArrayList<CatModel> catModelArrayList;

    public CategoriesResponse(ArrayList<CatModel> catModelArrayList) {
        this.catModelArrayList = catModelArrayList;
    }

    public ArrayList<CatModel> getCatModelArrayList() {
        return catModelArrayList;
    }

    public void setCatModelArrayList(ArrayList<CatModel> catModelArrayList) {
        this.catModelArrayList = catModelArrayList;
    }
}
