package com.example.APIService.repo.pojo;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
@Table(schema = "my_art",name = "cat_images")

public class CategoryImagePojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String imagesUrl;
    Integer catId;
    String  createdBy;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagesUrl() {
        return imagesUrl;
    }

    public void setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
