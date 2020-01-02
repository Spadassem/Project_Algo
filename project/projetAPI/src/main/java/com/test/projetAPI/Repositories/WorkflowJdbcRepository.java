package com.test.projetAPI.Repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;

import com.test.projetAPI.entities.Workflow;
import com.test.projetAPI.validator.RequestValidator;

@Repository
public class WorkflowJdbcRepository {

	@Autowired
	private WorkflowRestRepository repository;

	public List<Workflow> findAllWorkflow() {
		List<Workflow> list = (List<Workflow>) repository.findAll();
		return list;
	}

	public Pair<List<Workflow>, Integer> findWorkflowBy(String name, String categoriesIds, int status) {
		int validation = RequestValidator.validate(name, categoriesIds, status);
		
		//List<Workflow> list = (List<Workflow>) repository.findWorkflo(name, categoriesIds, status);
		//return Pair.of(list, validation);
		return null;
	}
}
