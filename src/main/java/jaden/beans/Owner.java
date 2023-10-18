/**
 * @author jeade - jeaden
 * CIS175 - Fall 2023
 *Oct 17, 2023
 */
package jaden.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Owner {
	private String name;
	private String phoneNumber;
	
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owner(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	

}
