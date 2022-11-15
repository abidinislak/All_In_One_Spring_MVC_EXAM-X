package com.SpringMvc.examx.entity;

import org.hibernate.envers.RevisionListener;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class CategoryRevisionListener implements RevisionListener  {
	
	

	@Override
	public void newRevision(Object revisionEntity) {
		CategoryRevEntity exampleRevEntity = (CategoryRevEntity) revisionEntity;
		
		
		
		
		Object principal = SecurityContextHolder .getContext().getAuthentication().getPrincipal();
		
		
		
	exampleRevEntity.setUsername(((UserDetails)principal).getUsername());
	}
	}


