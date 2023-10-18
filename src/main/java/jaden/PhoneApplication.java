package jaden;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import jaden.beans.Owner;
import jaden.beans.Phone;
import jaden.controller.BeanConfiguration;
import jaden.repository.PhoneRepository;

@SpringBootApplication
public class PhoneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PhoneApplication.class, args);
		
	}
	
	@Autowired
	PhoneRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Phone p = appContext.getBean("phone", Phone.class);
		p.setModel("14");
		repo.save(p);
		
		//Create a bean to use - not managed by Spring
		Phone q = new Phone("Iphone", "15", 2.99);
		Owner o = new Owner("Billy Jean", "123-456-7890");
		q.setOwner(o);
		repo.save(q);
		
		List<Phone> allPhones = repo.findAll();
		for(Phone phone: allPhones) {
			System.out.println(phone.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	
	}

}