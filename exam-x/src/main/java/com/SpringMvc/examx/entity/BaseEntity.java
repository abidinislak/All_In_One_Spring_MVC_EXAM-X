package com.SpringMvc.examx.entity;


import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {


	 @CreatedBy
	  private String createdBy;
	 
	 
	 @LastModifiedBy
	 private String LastModifiedBy;
	 
	 
	  @LastModifiedBy
	  private String modifiedBy;
	
    @Column(name = "created_date", nullable = false, updatable = false)
	@CreatedDate
	private LocalDateTime createdDate;


	@LastModifiedDate
	private LocalDateTime lastModifiedDate;
	
	
	

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
