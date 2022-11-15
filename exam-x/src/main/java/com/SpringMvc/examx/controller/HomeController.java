package com.SpringMvc.examx.controller;


import com.SpringMvc.examx.entity.Category;
import com.SpringMvc.examx.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {


	@Autowired
	CategoryService catgoryService;

	@GetMapping("home")
	public String homePage(Model model) {
		model.addAttribute("category", new Category());
		return "home";

	}

	@GetMapping("/jquery")

	public String jqueryProcess() {
		return "JqueryTry";
	}

	@PostMapping("/categories/check_unique")
	@ResponseBody
	public String jqueryPost(@Param("category") String category) {
		System.err.println(category);

		catgoryService.save(new Category(category));

		return "oldu";
	}

	@RequestMapping(path = "/categorylist", method = RequestMethod.GET)
	@ResponseBody
	public List<Category> getAllEmployees() {


		return catgoryService.findAll();


	}

	@RequestMapping(path = "/denemePurejavascript", method = RequestMethod.POST)
	@ResponseBody
	public String denemePurejavascript(Integer sendid) {


		catgoryService.deleteById(sendid);


		return "oldu";


	}


}
