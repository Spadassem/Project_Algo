package com.test.projetAPI.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.test.projetAPI.entities.Workflow;

@RepositoryRestResource
public interface WorkflowRestRepository extends CrudRepository<Workflow, Integer> {
	List<Workflow> findByName(String name);
	List<Workflow> findByEnabled(int status);
}

