package com.SpringMvc.examx.entity;

import org.hibernate.envers.RevisionListener;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class CatgeoryListener implements RevisionListener {

	@Override
	public void newRevision(Object revisionEntity) {


		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		
		String username = ((UserDetails)principal).getUsername();
		
		
		
		
		    Category mre = Category.class.cast( revisionEntity );
		    mre.setName( username);
	}
	
	
	
	

}
