package com.test.projetAPI.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Workflow.class)
public abstract class Workflow_ {

	public static volatile SingularAttribute<Workflow, String> name;
	public static volatile SingularAttribute<Workflow, String> description;
	public static volatile SingularAttribute<Workflow, Integer> idWorkflow;
	public static volatile SingularAttribute<Workflow, Integer> enabled;
	public static volatile SetAttribute<Workflow, WorkflowCategory> workflowCategories;

	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID_WORKFLOW = "idWorkflow";
	public static final String ENABLED = "enabled";
	public static final String WORKFLOW_CATEGORIES = "workflowCategories";

}

