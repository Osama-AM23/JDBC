package com.xworkz.fitness.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.fitness.entity.FitnessEntity;

public class DataInsertRunner {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		List<FitnessEntity> list = new ArrayList<FitnessEntity>();
		list.add(new FitnessEntity(101, LocalDate.of(2024, 12, 3), "Cardio", 30, 300, 4.2, 120, 4000, true));
		list.add(new FitnessEntity(102, LocalDate.of(2024, 12, 3), "Cardio", 25, 240, 4.0, 110, 3800, true));
		list.add(new FitnessEntity(103, LocalDate.of(2024, 12, 4), "Strength", 40, 420, 1.0, 120, 2000, true));
		list.add(new FitnessEntity(104, LocalDate.of(2024, 12, 4), "Balance Training", 45, 480, 1.0, 110, 1000, true));
		list.add(new FitnessEntity(105, LocalDate.of(2024, 12, 5), "Chest Press", 35, 380, 0.5, 120, 500, true));
		list.add(new FitnessEntity(106, LocalDate.of(2024, 12, 5), "Weight Lifting", 40, 300, 0.5, 115, 600, true));
		list.add(new FitnessEntity(107, LocalDate.of(2024, 12, 6), "Cardio", 60, 600, 5.0, 130, 5000, true));
		list.add(new FitnessEntity(108, LocalDate.of(2024, 12, 6), "Yoga", 50, 450, 0.0, 100, 3500, true));
		list.add(new FitnessEntity(109, LocalDate.of(2024, 12, 7), "Strength", 45, 470, 1.2, 125, 2500, true));
		list.add(new FitnessEntity(110, LocalDate.of(2024, 12, 7), "Cardio", 30, 310, 4.5, 120, 4200, true));
		list.add(new FitnessEntity(111, LocalDate.of(2024, 12, 8), "Chest Press", 35, 370, 3.5, 130, 4500, true));
		list.add(new FitnessEntity(112, LocalDate.of(2024, 12, 8), "Strength", 50, 500, 1.0, 135, 2000, true));
		list.add(new FitnessEntity(113, LocalDate.of(2024, 12, 9), "Cardio", 40, 420, 4.3, 125, 4400, true));
		list.add(new FitnessEntity(114, LocalDate.of(2024, 12, 9), "Yoga", 55, 500, 0.0, 115, 3600, true));
		list.add(new FitnessEntity(115, LocalDate.of(2024, 12, 10), "Weight Lifting", 45, 420, 0.5, 120, 600, true));
		list.add(new FitnessEntity(116, LocalDate.of(2024, 12, 10), "Cardio", 60, 650, 5.2, 130, 5100, true));
		list.add(new FitnessEntity(117, LocalDate.of(2024, 12, 10), "Balance Training", 40, 400, 1.2, 110, 3200, true));
		list.add(new FitnessEntity(118, LocalDate.of(2024, 12, 11), "Squats", 30, 320, 3.8, 125, 4300, true));
		list.add(new FitnessEntity(119, LocalDate.of(2024, 12, 11), "Yoga", 50, 480, 0.0, 100, 3400, true));
		list.add(new FitnessEntity(120, LocalDate.of(2024, 12, 11), "Strength", 55, 540, 1.3, 130, 2800, true));

		for (FitnessEntity entity : list) {
			eManager.persist(entity);
		}

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
