package com.test.projetAPI.Repositories;

import java.util.List;

import com.test.projetAPI.entities.Workflow;

public interface CustomWorkflowRestRepository {
	List<Workflow> findWorkflowBy(String name,String categoriesIds,Integer status); 
	
}
