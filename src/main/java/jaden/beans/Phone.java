/**
 * @author jeade - jeaden
 * CIS175 - Fall 2023
 *Oct 17, 2023
 */
package jaden.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Phone {
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private String model;
	private double price;
	@Autowired
	private Owner owner;
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", owner=" + owner
				+ "]";
	}


	
	

}
