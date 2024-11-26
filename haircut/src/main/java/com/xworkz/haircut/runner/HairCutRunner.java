package com.xworkz.haircut.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.haircut.entity.HairCutEntity;

public class HairCutRunner {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("hair");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();
			HairCutEntity entity = new HairCutEntity("Curly Shag", 200);
			eManager.persist(entity);
			eTrans.commit();

		} catch (Exception e) {

			if (eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();

		} finally {
			eManager.close();
			emFactory.close();
		}
	}
}
