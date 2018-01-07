/**
 * 
 */
package com.healthcare.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kumarrajk
 *
 */
@Table
public class Person {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
