package com.abc.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abc.entities.CovoredVehiclesEntity;

@Repository
@Transactional
public class CovoredVehiclesRepository {
	private EntityManager em;

	public void save(CovoredVehiclesEntity vehicle) {

		em.persist(vehicle);
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	

}
