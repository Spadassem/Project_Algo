package com.test.projetAPI.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.test.projetAPI.entities.WorkflowCategory;;

@RepositoryRestResource
public interface WorkflowcategoryRestRepository extends CrudRepository<WorkflowCategory, Integer> {

}