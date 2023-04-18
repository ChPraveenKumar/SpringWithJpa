package com.example.SpringWithJpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@Column
	private int personId;
	@Column
	private String personName;
	@Column
	private String address;
	@Column
	private String city;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", address=" + address + ", city=" + city
				+ "]";
	}
	
	

}
