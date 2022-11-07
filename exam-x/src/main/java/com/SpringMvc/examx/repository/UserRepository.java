package com.SpringMvc.examx.repository;

import com.SpringMvc.examx.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


	User findByEmail(String email);

}
