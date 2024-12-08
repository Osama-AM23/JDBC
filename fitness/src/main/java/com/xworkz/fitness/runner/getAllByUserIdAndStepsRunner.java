package com.xworkz.fitness.runner;

import java.util.List;

import javax.persistence.*;

import com.xworkz.fitness.entity.FitnessEntity;

public class getAllByUserIdAndStepsRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("getAllByUserIdAndSteps");
		query.setParameter("user", 112);
		query.setParameter("stp", 2000);
		
		List<FitnessEntity> list= query.getResultList();
		list.forEach(get->System.out.println(get));


	}

}
