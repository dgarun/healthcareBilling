/**
 * 
 */
package com.healthcare.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.healthcare.dto.PersonDto;
import com.healthcare.model.Person;
import com.healthcare.services.PersonService;

/**
 * @author kumarrajk
 *
 */
@Component
public class PersonManager {
	
	@Autowired
	private PersonService personService;
	
	public Boolean savePerson()
	{
		PersonDto personDto = populatePerson();
		Boolean isSaved = personService.savePerson(personDto);
		return isSaved;
	}
	
	public PersonDto populatePerson()
	{
		PersonDto personDto = new PersonDto("Arun","Kumar",26,null);
		return personDto;
	}
	
	public Person transformPersonDtotoPerson(PersonDto personDto)
	{
		Person person = new Person();
		if(personDto != null)
		{
			person.setFirstName(personDto.getFirstName());
			person.setLastName(personDto.getLastName());
			person.setAge(personDto.getAge());
			person.setDob(personDto.getDob());
		}
		return person;
	}
}
