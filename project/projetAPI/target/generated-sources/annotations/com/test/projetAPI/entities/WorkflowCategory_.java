package com.test.projetAPI.entities;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WorkflowCategory.class)
public abstract class WorkflowCategory_ {

	public static volatile SingularAttribute<WorkflowCategory, Date> createdAt;
	public static volatile SingularAttribute<WorkflowCategory, String> name;
	public static volatile SingularAttribute<WorkflowCategory, String> description;
	public static volatile SingularAttribute<WorkflowCategory, String> logo;
	public static volatile SingularAttribute<WorkflowCategory, WorkflowCategory> categoryParent;
	public static volatile SingularAttribute<WorkflowCategory, Integer> idCategory;
	public static volatile SingularAttribute<WorkflowCategory, Integer> enabled;
	public static volatile SingularAttribute<WorkflowCategory, Date> updatedAt;

	public static final String CREATED_AT = "createdAt";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String LOGO = "logo";
	public static final String CATEGORY_PARENT = "categoryParent";
	public static final String ID_CATEGORY = "idCategory";
	public static final String ENABLED = "enabled";
	public static final String UPDATED_AT = "updatedAt";

}

