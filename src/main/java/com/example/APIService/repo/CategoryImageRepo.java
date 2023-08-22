package com.example.APIService.repo;

import com.example.APIService.repo.pojo.CategoryImagePojo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryImageRepo extends JpaRepository<CategoryImagePojo,Integer> {
    List<CategoryImagePojo> findByCatId(int catId);
}
