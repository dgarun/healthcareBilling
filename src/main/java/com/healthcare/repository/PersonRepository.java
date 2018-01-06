package com.healthcare.repository;

import org.springframework.data.repository.CrudRepository;

import com.healthcare.model.Person;

public interface PersonRepository extends CrudRepository<Person,Long> {

	public Person findById(Long id);
}
