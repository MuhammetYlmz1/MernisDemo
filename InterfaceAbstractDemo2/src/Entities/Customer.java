package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity {
	private int id ;
	private String FirstName;
	private String LastName;
	private Date DateofBirth;
	private String NationalityId;
	
	public Customer() {
		
	}
	
	
	public Customer(int id, String firstName, String lastName, Date dateofBirth, String nationalityId) {
		
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateofBirth = dateofBirth;
		NationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	

}
