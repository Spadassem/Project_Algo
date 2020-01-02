package com.test.projetAPI.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class WorkflowCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCategory;
	private String name;
	private String description;
	private String logo;
	private Date createdAt;
	private Date updatedAt;
	private Integer enabled;
	@OneToOne
	@JoinColumn(nullable = true)
	@JsonBackReference
	private WorkflowCategory categoryParent;
	
	public Integer getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public WorkflowCategory getCategoryParent() {
		return categoryParent;
	}

	public void setCategoryParent(WorkflowCategory categoryParent) {
		this.categoryParent = categoryParent;
	}

}
