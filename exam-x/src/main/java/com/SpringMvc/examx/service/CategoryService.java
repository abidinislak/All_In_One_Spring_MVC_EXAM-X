package com.SpringMvc.examx.service;


import com.SpringMvc.examx.entity.Category;
import com.SpringMvc.examx.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CategoryService  {


@Autowired
CategoryRepository repo;


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
