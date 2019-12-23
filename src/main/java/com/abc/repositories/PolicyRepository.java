package com.abc.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abc.entities.PolicyEntity;

@Repository
@Transactional
public class PolicyRepository {

	private EntityManager em;

	public void save(PolicyEntity policy) {
		em.persist(policy);
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
