package com.abc.repositories;

import javax.persistence.EntityManager;

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

}
