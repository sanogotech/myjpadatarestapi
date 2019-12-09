package com.macrosoft.myproject.entity;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



/**
 * Description of Departement.
 * 
 * @author User
 */
@Entity
public class Departement {
	
	@Id
	@GeneratedValue
	//Default
	// @GeneratedValue(strategy=AUTO)
	private Long  idDepartement;
	
	private String  departementName;
	/**
	/**
	 * Description of the property locations.
	 */
    @OneToOne
	private Location location = null;

	/**
	 * Description of the property employees.
	 */
    @OneToMany
	public HashSet<Employee> employees = new HashSet<Employee>();
	//I use:
	//Set: when the items in the collections have no order and are unique
    //List: when the items has a order

	/**
	 * The constructor.
	 */
	public Departement() {
		super();
	}


	/**
	 * Returns employees.
	 * @return employees 
	 */
	public HashSet<Employee> getEmployees() {
		return this.employees;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}


	public String getDepartementName() {
		return departementName;
	}


	public void setDepartementName(String departementName) {
		this.departementName = departementName;
	}
	
	

}
