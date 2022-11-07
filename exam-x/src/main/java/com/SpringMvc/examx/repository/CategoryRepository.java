package com.SpringMvc.examx.repository;

import com.SpringMvc.examx.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository  extends JpaRepository<Category,Short> {
}