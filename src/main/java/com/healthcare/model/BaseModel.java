package com.healthcare.model;

import javax.persistence.Column;

public class BaseModel {

	@Column(name="is_active")
	private byte isActive;

	@Column(name="created_on")
	private String createdOn;

	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="updated_by")
	private String updatedBy;
	
}
