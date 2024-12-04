package com.xworkz.eCommerce.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.eCommerce.entity.ECommerceEntity;

public class InsertDataRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("ecom");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		List<ECommerceEntity> list=new ArrayList<ECommerceEntity>();
		list.add(new ECommerceEntity(20115, "parachute oil", 213, "HairCare"));
		list.add(new ECommerceEntity(28012, "Wellcore-Creatine", 600, "Supplements"));
		list.add(new ECommerceEntity(30012, "Jockey-InnerWear", 400, "Undergarments"));
		list.add(new ECommerceEntity(40518, "Nothing 2A +", 21999, "Mobiles"));
		list.add(new ECommerceEntity(10316, "Milton-Flask", 999, "Kitchenware"));
		list.add(new ECommerceEntity(70518, "CakeTins", 249, "Kitchenware"));
		list.add(new ECommerceEntity(00510, "Drone E88 Pro", 2640, "Cameras"));
		list.add(new ECommerceEntity(80745, "HDMI Cable", 499, "Accessories"));
		list.add(new ECommerceEntity(10505, "Vim liquid", 470, "Kitchenware"));
		list.add(new ECommerceEntity(19087, "U-shape Neck Pillow", 210, "Home Accessories"));
		list.add(new ECommerceEntity(10102, "Hamaam Soap", 100, "Bath&Body"));
		list.add(new ECommerceEntity(34560, "DSLR Camera", 52999, "Electronics"));
		list.add(new ECommerceEntity(10135, "Fitness Tracker", 1000, "Sports"));
		list.add(new ECommerceEntity(19084, "Desk Lamp", 699, "Furniture"));
		list.add(new ECommerceEntity(67686, "Running Shoes", 1499, "Footwear"));
		
for (ECommerceEntity eCommerceEntity : list) {
			
		    eManager.persist(eCommerceEntity);
		}
		
		try {
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}finally {
			eManager.close();
			emFactory.close();
		}

	}

}
