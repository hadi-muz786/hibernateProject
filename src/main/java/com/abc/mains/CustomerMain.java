package com.abc.mains;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.entities.CustomerEntity;
import com.abc.repositories.CustomerRepository;

public class CustomerMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		CustomerRepository cr = (CustomerRepository) ctx.getBean("customerRepository");

		Calendar cal2 = Calendar.getInstance();

		cal2.set(Calendar.YEAR, 2019);

		cal2.set(Calendar.MONTH, 7);

		cal2.set(Calendar.DAY_OF_MONTH, 1);

		Date dob = cal2.getTime();

		CustomerEntity ce = new CustomerEntity();
		ce.setName("ABCDEF");
		ce.setEmail("abc@yahoo.com");
		ce.setPhone("1234567890");
		ce.setGender("M");
		ce.setLastFourSsn("1122");
		ce.setDate(dob);

		cr.save(ce);

	}

}
