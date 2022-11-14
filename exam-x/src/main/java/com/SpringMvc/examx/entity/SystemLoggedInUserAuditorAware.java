package com.SpringMvc.examx.entity;

import java.util.Optional;



import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class SystemLoggedInUserAuditorAware implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor( )  {
	  
	 
	  Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

	  
      return Optional.of(((UserDetails)principal).getUsername());
  }


}