package com.test.projetAPI;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.projectAPI.exception.InvalidCategoryIdException;
import com.test.projectAPI.exception.InvalidEnabledException;
import com.test.projetAPI.RepositoriesImpl.WorkflowRestRepositoryImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkflowTest {

    @Autowired
    private WorkflowRestRepositoryImpl workflowRepository;
    
	
	@Test(expected = InvalidEnabledException.class)
	public void findbyEnabled() {
		workflowRepository.findWorkflowBy(null, null, 8);
	}
	
	@Test(expected = InvalidCategoryIdException.class)
	public void findbyCategory() {
			workflowRepository.findWorkflowBy(null, "1,2dj", 2);
		
	}
	@Test
	public void findbyAll() {
			workflowRepository.findWorkflowBy("RH", "1,2", 2);
	}

}
