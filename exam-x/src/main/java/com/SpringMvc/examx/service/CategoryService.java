package com.SpringMvc.examx.service;


import com.SpringMvc.examx.entity.Category;
import com.SpringMvc.examx.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {


	@Autowired
	CategoryRepository repo;


	public void deleteById(Short id) {


		repo.deleteById(id);
	}

	public Category findById(Short id) {
		return repo.findById(id).get();
	}

	public List<Category> findAll() {
		return repo.findAll();
	}


	public Category save(Category entity) {
		return repo.save(entity);
	}


}
