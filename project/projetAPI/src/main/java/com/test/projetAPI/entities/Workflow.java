package com.test.projetAPI.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.metamodel.StaticMetamodel;

import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
public class Workflow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idWorkflow;
	private String name;
	private String description;
	private Integer enabled;
	@ManyToMany
	@JsonManagedReference
    Set<WorkflowCategory> workflowCategories;
	
	
	public Integer getIdWorkflow() {
		return idWorkflow;
	}

	public void setIdWorkflow(Integer idWorkflow) {
		this.idWorkflow = idWorkflow;
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

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Set<WorkflowCategory> getWorkflowCategories() {
		return workflowCategories;
	}

	public void setWorkflowCategories(Set<WorkflowCategory> workflowCategories) {
		this.workflowCategories = workflowCategories;
	}
	
	
}
