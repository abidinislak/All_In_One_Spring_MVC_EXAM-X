package com.SpringMvc.examx.service;


import com.SpringMvc.examx.entity.User;
import com.SpringMvc.examx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {



	@Autowired
	UserRepository repo;


	public User findById(Integer id){


		return repo.findById(id).get();
	}

	public User findByEmail(String email) {


		return repo.findByEmail(email);
	}


}
