package com.xworkz.fitness.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.fitness.entity.FitnessEntity;

public class GetAllQueryRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("getAll");
		List<FitnessEntity> list=query.getResultList();
		list.forEach(get->System.out.println(get));
		
		
		

	}

}
