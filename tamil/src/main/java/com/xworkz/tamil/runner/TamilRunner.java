package com.xworkz.tamil.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.tamil.entity.TamilEntity;

public class TamilRunner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("arun");

		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			TamilEntity entity = new TamilEntity();
			entity.setId(2);
			entity.setDirector("Mani Ratnam");
			entity.setReleseDate("September 28, 2023");
			entity.setTitle("Ponniyin Selvan I");
			entity.setHero("Vikram");
			entity.setHeroine("Aishwarya Rai Bachchan");
			entity.setRating("8.5");
			entity.setLang("Tamil");

			entityManager.persist(entity);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}
		
	}

}
