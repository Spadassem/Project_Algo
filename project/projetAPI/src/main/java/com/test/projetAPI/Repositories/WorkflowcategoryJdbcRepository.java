package com.test.projetAPI.Repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.test.projetAPI.entities.WorkflowCategory;

@Repository
public class WorkflowcategoryJdbcRepository {


	@Autowired
    private WorkflowcategoryRestRepository repository;
	
	public List<WorkflowCategory> findAllWorkflowCategory() {
		List<WorkflowCategory> list = (List<WorkflowCategory>) repository.findAll();
		return list;
	}
}
