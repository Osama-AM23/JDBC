package com.xworkz.camera.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.camera.dto.CameraDto;

public class FetchRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("camera");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Integer id=2;
		
		CameraDto dto = eManager.find(CameraDto.class, id);
		
		System.out.println("Value of ID : "+dto.getCameraName());
		
		try {
			eTrans.begin();
			eTrans.commit();
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();
		}finally {
			eManager.close();
			emFactory.close();
		}

	}

}
