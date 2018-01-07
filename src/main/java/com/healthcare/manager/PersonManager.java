/**
 * 
 */
package com.healthcare.manager;

import org.springframework.stereotype.Component;

import com.healthcare.model.Person;
import com.healthcare.repository.PersonRepository;

/**
 * @author kumarrajk
 *
 */
@Component
public class PersonManager {
	
	private PersonRepository personRepository;
	
	public Boolean savePerson(Person person)
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
		
		personRepository.save(person);
		if(person != null)
		{
			return true;
		}
		return false;
	}
}
