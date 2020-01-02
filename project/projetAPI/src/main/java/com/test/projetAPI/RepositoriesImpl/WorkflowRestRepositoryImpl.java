package com.test.projetAPI.RepositoriesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.SetJoin;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.projectAPI.exception.InvalidCategoryIdException;
import com.test.projectAPI.exception.InvalidEnabledException;
import com.test.projetAPI.Repositories.CustomWorkflowRestRepository;
import com.test.projetAPI.Repositories.WorkflowRestRepository;
import com.test.projetAPI.Repositories.WorkflowcategoryRestRepository;
import com.test.projetAPI.entities.Workflow;
import com.test.projetAPI.entities.WorkflowCategory;
import com.test.projetAPI.entities.WorkflowCategory_;
import com.test.projetAPI.entities.Workflow_;
import com.test.projetAPI.validator.RequestValidator;

public class WorkflowRestRepositoryImpl {

	@Autowired
	private WorkflowRestRepository repository;

	@PersistenceContext
	private EntityManager em;

	public List<Workflow> findWorkflowBy(String name, String categoryIds, Integer enabled) {

		int validation = RequestValidator.validate(name, categoryIds, enabled);
		if (validation == RequestValidator.INVALID_CATEGORY_IDS_PARAM) {
			throw new InvalidCategoryIdException();
		}
		if (validation == RequestValidator.INVALID_STATUS_PARAM) {
			throw new InvalidEnabledException();
		}

		List<Integer> categoriesIds = new ArrayList<Integer>();
		
		if (categoryIds != null) {
			String categoryArray[] = categoryIds.split(",");
			for (int i =0;i<categoryArray.length;i++) {
				int id = Integer.parseInt(categoryArray[i]);
				categoriesIds.add(id);
			}
		}
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Workflow> criteria = cb.createQuery(Workflow.class);
		Root<WorkflowCategory> workflowCategoryCriteria = criteria.from(WorkflowCategory.class);
		Root<Workflow> workflowCriteria = criteria.from(Workflow.class);
		Metamodel m = em.getMetamodel();

		List<Predicate> predicates = new ArrayList<Predicate>();
     
		EntityType<Workflow> workflowEntityType = m.entity(Workflow.class);
		
		if (name != null) {
			Predicate predicateName = cb.equal(workflowCriteria.get("name"), name);
			predicates.add(predicateName);
		}

		if (enabled !=null && (enabled >=1 || enabled <=5)) {
			Predicate predicateStatus = cb.equal(workflowCriteria.get("enabled"), enabled);
			predicates.add(predicateStatus);
		}
		
		if (categoriesIds != null && categoriesIds.size() > 0) {
			System.out.println(categoriesIds);
			Predicate predicateCategory = workflowCriteria.join(Workflow_.WORKFLOW_CATEGORIES)
					.in(categoriesIds);
			predicates.add(predicateCategory);
		}
		

		Predicate[] itemsArray = new Predicate[predicates.size()];
		itemsArray = predicates.toArray(itemsArray);

		if (itemsArray.length > 0) {
			criteria.select(workflowCriteria).distinct(true);
			criteria.where(itemsArray);
		}
		
		
		TypedQuery<Workflow> query = em.createQuery(criteria);
		
		

		return query.getResultList();
	}

}
