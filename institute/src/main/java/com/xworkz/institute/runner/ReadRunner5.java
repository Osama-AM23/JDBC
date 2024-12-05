package com.xworkz.institute.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ReadRunner5 {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("institute");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		// find officeNo By Name
		Query query=eManager.createNamedQuery("findOfficeNoByName");
		query.setParameter("setName", "Sreeja");
		Object obj= query.getSingleResult();
		Long ref= (Long)obj;
		System.out.println("Value of the OfficeNo :"+ref);

	}

}
