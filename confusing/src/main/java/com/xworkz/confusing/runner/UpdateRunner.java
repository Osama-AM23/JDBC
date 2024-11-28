package com.xworkz.confusing.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;
import com.xworkz.confusing.dto.ConfusingDto;

public class UpdateRunner {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("confuse");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		List<ConfusingDto> list = eManager.createQuery("select cd from ConfusingDto cd", ConfusingDto.class)
				.getResultList();

		for (ConfusingDto dto : list) {
			System.out.println("Confusing List = " + dto.getName() + ", " + dto.getEmail() + ", " + dto.getAge() + " ,"
					+ dto.getPhoneNo());
		}

		try {

			eTrans.begin();

			int query = eManager
					.createQuery("UPDATE ConfusingDto c SET c.name = :myname, c.email = :myemail WHERE "
							+ "c.phoneNo = :phoneNo")
					.setParameter("myname", "Assadiq").setParameter("myemail", "assadiq@gmail.com")
					.setParameter("phoneNo", Long.valueOf("8076541700")).executeUpdate();
					//here i given phoneNo data type as long so i use Long.valueOf() method and it's change String to Long

			if (query > 0) {
				System.out.println("Update Succesfully");
			} else {
				System.err.println("Not Update");
			}

			eTrans.commit();

		} catch (Exception e) {
			if (eTrans.isActive()) {
				eTrans.rollback();
			}
		} finally {
			eManager.close();
			emFactory.close();
		}

	}

}
