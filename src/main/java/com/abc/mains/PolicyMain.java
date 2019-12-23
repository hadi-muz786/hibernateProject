package com.abc.mains;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.entities.PolicyEntity;
import com.abc.repositories.PolicyRepository;

public class PolicyMain {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("application-context.xml");
		PolicyRepository pr = (PolicyRepository) apc.getBean("policyRepository");

		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, 2019);

		cal.set(Calendar.MONTH, 11);

		cal.set(Calendar.DAY_OF_MONTH, 22);

		Date startdate = cal.getTime();

		Calendar cal2 = Calendar.getInstance();

		cal2.set(Calendar.YEAR, 2022);

		cal2.set(Calendar.MONTH, 11);

		cal2.set(Calendar.DAY_OF_MONTH, 22);

		Date expiredate = cal.getTime();

		PolicyEntity pe = new PolicyEntity();
		pe.setType("something policy");
		pe.setPolicyNo("AK47000");
		pe.setPrice(23);
		pe.setStartDate(startdate);
		pe.setExpireDate(expiredate);
		pr.save(pe);

	}

}
