package com.xworkz.institute.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.institute.entities.InstituteEntity;

public class ReaderRunner {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("institute");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		// Data Finding by ProfessorId
		Query query1 = eManager.createNamedQuery("findByProfessorId");
		query1.setParameter("profId", 202325);

		Object obj = query1.getSingleResult();
		InstituteEntity inst = (InstituteEntity) obj;
		System.out.println("Value of the Professor Id :" + inst);

		
	}

}
