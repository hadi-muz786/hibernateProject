package com.abc.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abc.entities.CustomerEntity;

@Repository
@Transactional
public class CustomerRepository {

	private EntityManager em;

	
	
	public void save(CustomerEntity customer) {

		em.persist(customer);
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
