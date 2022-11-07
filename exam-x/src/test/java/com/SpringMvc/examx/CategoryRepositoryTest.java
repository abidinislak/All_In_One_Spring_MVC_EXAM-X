package com.SpringMvc.examx;

import com.SpringMvc.examx.entity.Category;
import com.SpringMvc.examx.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



@DataJpaTest(showSql = true)
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
public class CategoryRepositoryTest
{


	@Autowired
	CategoryRepository repo;



	@Test
	public void testCategorySave(){
		Category tempCategory=new Category();

		tempCategory.setName("test First category");

		repo.save(tempCategory);

		assertThat(tempCategory.getId()).isGreaterThan((short) 0);



	}


}
