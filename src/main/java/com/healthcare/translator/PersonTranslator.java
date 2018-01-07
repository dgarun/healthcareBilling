package com.healthcare.translator;

import org.springframework.stereotype.Component;


import com.healthcare.dto.PersonDto;
import com.healthcare.model.Person;

@Component
public class PersonTranslator {

	public Person translateToPerson(PersonDto personDto)
	{
		Person person = new Person();
		if(personDto != null)
		{
			person.setId(personDto.getId());
			person.setFirstName(personDto.getFirstName());
			person.setLastName(personDto.getLastName());
			person.setAge(personDto.getAge());
		}
		return person;
	}
	
}
