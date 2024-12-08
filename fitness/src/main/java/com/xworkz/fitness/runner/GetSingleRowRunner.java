package com.xworkz.fitness.runner;

import java.util.List;

import javax.persistence.*;

import com.xworkz.fitness.entity.FitnessEntity;

public class GetSingleRowRunner {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		Query query = eManager.createNamedQuery("getSingleRow");
		query.setParameter("id", 4);
		
		List<FitnessEntity>list= query.getResultList();
		list.forEach(get->System.out.println(get));
		
		try {

			eTrans.begin();
			eTrans.commit();

		} catch (Exception e) {

			if (eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();
		} finally {
			emFactory.close();
			eManager.close();
		}


	}

}
