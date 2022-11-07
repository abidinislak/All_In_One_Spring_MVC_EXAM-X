package com.SpringMvc.examx;


import com.SpringMvc.examx.entity.User;
import com.SpringMvc.examx.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest(showSql = true)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)

public class UserRepostoryTest {


	@Autowired
	UserRepository repo;


	@Test
	public void testFindUser(){

		User findUSer=repo.findById(1).get();

		assertThat(findUSer.getName().toString().length()).isGreaterThan(0);


	}
@Test
	public void testFindByEmail() {

		User userEmail= repo.findByEmail("agbolu14");
	System.err.println(userEmail.getEmail());
		assertThat(userEmail.getEmail()).isEqualTo("agbolu14");


}

}


