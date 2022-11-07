package com.SpringMvc.examx.controller;


import com.SpringMvc.examx.entity.Category;
import com.SpringMvc.examx.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CategoryController {


	@Autowired
	CategoryService service;

	@GetMapping("category")
	public String CategoryHome(Model model ){
		List<Category> cListe= service.findAll();
		model.addAttribute("cListe",cListe);
		return "category/categoryHome";
	}
	@GetMapping("newcategory")
	public String saveCategory(Model model){
		model.addAttribute("categoryList", service.findAll());
model.addAttribute("category",new Category());
return "category/category_form";
	}
	@GetMapping("/updatecategeory/edit/{id}")
	public String updateCategory(@PathVariable(name = "id") Short id,Model model    ){
		model.addAttribute("category", service.findById(id));
		model.addAttribute("categoryList", service.findAll());
		return "category/category_form";
	}
	@PostMapping("/saveCategory")
	public String saveCategory( Category category ,RedirectAttributes redirectAttributes   ){
try{
	service.save(category);
redirectAttributes.addFlashAttribute("message","Succecfuly saved");
	return "redirect:category";
}
catch (Exception ex){
	redirectAttributes.addFlashAttribute("message","Error, admisnistrotor");
	return "redirect:category";
}
	}
}

