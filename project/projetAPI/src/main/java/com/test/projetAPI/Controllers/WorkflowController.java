package com.test.projetAPI.Controllers;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.projetAPI.entities.Workflow;
import com.test.projetAPI.validator.RequestValidator;
import com.test.projectAPI.exception.InvalidCategoryIdException;
import com.test.projectAPI.exception.InvalidEnabledException;
import com.test.projetAPI.Repositories.WorkflowJdbcRepository;
import com.test.projetAPI.RepositoriesImpl.WorkflowRestRepositoryImpl;

@RestController
public class WorkflowController {

	@Autowired
	WorkflowRestRepositoryImpl workflowRestRepositoryImpl;

	@GetMapping("/workflows")
	List<Workflow> findAllWorkflow(@RequestParam(required = false) String name,
			@RequestParam(required = false) String categoryIds, @RequestParam(required = false)  Integer enabled) {

		
		
		
			return workflowRestRepositoryImpl.findWorkflowBy(name, categoryIds, enabled);
		
	}

}
