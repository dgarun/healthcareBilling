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
import com.healthcare.translator.PersonTranslator;

/**
 * @author kumarrajk
 *
 */
@Service
public class PersonService {
	
	@Autowired
	private PersonManager personManager;
	
	@Autowired
	private PersonTranslator personTranslator;
	
	public Boolean savePerson()
	{
		PersonDto personDto = populatePerson();
		Boolean isSaved = personManager.savePerson(personTranslator.translateToPerson(personDto));
		return isSaved;
	}
	
	public PersonDto populatePerson()
	{
		PersonDto personDto = new PersonDto("Arun","Kumar",26,null);
		return personDto;
	}
	
	
	
	

}
