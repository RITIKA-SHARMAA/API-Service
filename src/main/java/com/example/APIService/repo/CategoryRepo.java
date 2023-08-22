package com.example.APIService.repo;

import com.example.APIService.repo.pojo.CategoryPojo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<CategoryPojo,Integer> {


}
