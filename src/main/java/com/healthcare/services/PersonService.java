/**
 * 
 */
package com.healthcare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.dto.PersonDto;
import com.healthcare.manager.PersonManager;
import com.healthcare.model.Person;
import com.healthcare.repository.PersonRepository;

/**
 * @author kumarrajk
 *
 */
@Service
public class PersonService {
	
	@Autowired
	private PersonManager personManager;
	
	@Autowired
	private PersonRepository personRepository;
	
	public Boolean savePerson(PersonDto personDto)
	{
		
		/*EntityManagerFactory emf=Persistence.
				createEntityManagerFactory("jpa");
	    EntityManager em=emf.createEntityManager();
	    try{
	      EntityTransaction entr=em.getTransaction();
	      entr.begin();
	      Employee emp = new Employee();
	      emp.setEmpName("Vinod Kumar");
	      emp.setEmpSalary(20000);
	      em.persist(emp);
	      entr.commit();
	    }
	    finally{
	      em.close();
	    }*/
		
		Person person = personRepository.save(personManager.transformPersonDtotoPerson(personDto));
		if(person != null)
		{
			return true;
		}
		return false;
	}
	
	

}
