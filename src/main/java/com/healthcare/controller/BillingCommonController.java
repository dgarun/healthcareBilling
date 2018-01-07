package com.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.manager.PersonManager;
import com.healthcare.services.PersonService;

@RestController
public class BillingCommonController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private PersonManager personManager;
	
	@RequestMapping("/savePerson")  
    public String savePerson(){
		
		System.out.println("Is Person Saved to Database : " + personManager.savePerson());
		
        return "Saved!";  
    }  
}
