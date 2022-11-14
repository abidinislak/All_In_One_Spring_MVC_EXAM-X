package com.SpringMvc.examx.entity;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
@EntityListeners(AuditingEntityListener.class)

public class Category extends BaseEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	@Column(length = 128, nullable = false, unique = true)
	@NotBlank(message = "Category name must not be emty")
	private String name;
	@Column(length = 128, unique = true)
	private String alias;
	private boolean enabled;
	@OneToOne
	@JoinColumn(name = "parent_id")
	private Category parent;
	@OneToMany(mappedBy = "parent")
	private Set<Category> children = new HashSet<>();

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

	public Set<Category> getChildren() {
		return children;
	}

	public void setChildren(Set<Category> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Category{" +
				"name='" + name + '\'' +
				'}';
	}
}
