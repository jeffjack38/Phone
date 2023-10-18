/**
 * @author jeade - jeaden
 * CIS175 - Fall 2023
 *Oct 17, 2023
 */
package jaden.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jaden.beans.Owner;
import jaden.beans.Phone;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Phone phone() {
		Phone bean = new Phone();
		bean.setBrand("Iphone");
		bean.setModel("15");
		bean.setPrice(1.99);
		return bean;
	}
	
	@Bean
	public Owner owner() {
		Owner bean = new Owner("Nigel Kite", "123-456-7890");
		return bean;
	}

}
