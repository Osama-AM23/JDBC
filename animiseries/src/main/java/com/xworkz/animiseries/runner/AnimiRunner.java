package com.xworkz.animiseries.runner;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.animiseries.dto.AnimiEntity;

public class AnimiRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com");

		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			AnimiEntity animi  = new AnimiEntity();
			animi.setId(5);
			animi.setName("Ben10 Ultimate Series");
			animi.setRatings(4.5);

			entityManager.persist(animi);
			et.commit();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			entityManager.close();
			eMF.close();

		}

	}
}
