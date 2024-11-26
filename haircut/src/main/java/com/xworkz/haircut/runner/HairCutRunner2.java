package com.xworkz.haircut.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.haircut.entity.HairCutEntity;

public class HairCutRunner2 {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("hair");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();
			Integer id = 9;
			HairCutEntity entity = new HairCutEntity();
			HairCutEntity val = eManager.find(HairCutEntity.class, id);

			eManager.remove(val);
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
