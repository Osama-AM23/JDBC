package com.xworkz.confusing.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.confusing.dto.ConfusingDto;

public class ConfusingRunner {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("confuse");
		EntityManager em = emFactory.createEntityManager();
		EntityTransaction eTrans = em.getTransaction();

		List<ConfusingDto> list = new ArrayList<ConfusingDto>();
		list.add(new ConfusingDto("Aswin", "aswin23@gmail.com", 23, 8012365706L));
		list.add(new ConfusingDto("Arun", "arun24@gmail.com", 22, 7033265706L));
		list.add(new ConfusingDto("Anwar", "anwar23@gmail.com", 21, 8076541700L));
		list.add(new ConfusingDto("Basheer", "basheer043@gmail.com", 23, 7012365856L));
		list.add(new ConfusingDto("Chran", "chran02@gmail.com", 22, 6087365706L));
		list.add(new ConfusingDto("Dhanush", "dhanush@gmail.com", 23, 8012365706L));
		list.add(new ConfusingDto("Eliyaz", "eliyaz@gmail.com", 25, 9952011875L));
		list.add(new ConfusingDto("Farman", "farman@gmail.com", 19, 7094412094L));
		list.add(new ConfusingDto("Hameed", "hameed@gmail.com", 20, 6034276543L));
		list.add(new ConfusingDto("Osama", "osama23@gmail.com", 20, 6522410229L));
		list.add(new ConfusingDto("thameem", "thameem@gmail.com", 21, 9842076104L));
		list.add(new ConfusingDto("Mujahid", "mujahid@gmail.com", 21, 9047650654L));
		
		for (ConfusingDto confusingDto : list) {
			
		    em.persist(confusingDto);
		}
		
		try {
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}finally {
			em.close();
			emFactory.close();
		}

	}

}
