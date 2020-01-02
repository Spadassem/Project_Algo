package com.test.projetAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.projetAPI.entities.WorkflowCategory;
import com.test.projetAPI.Repositories.WorkflowcategoryJdbcRepository;

@RestController
public class WorkflowcategoryController {

	@Autowired
	WorkflowcategoryJdbcRepository w;

	@GetMapping("/workflowcategories")
	List<WorkflowCategory> findAllWorkflowCategory() {
         return w.findAllWorkflowCategory();
		
	}
}
