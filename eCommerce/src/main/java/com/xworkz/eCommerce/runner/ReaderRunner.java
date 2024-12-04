package com.xworkz.eCommerce.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.eCommerce.entity.ECommerceEntity;

public class ReaderRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("ecom");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("findByProdcutId");
		Object obj=query.getSingleResult();
		
		ECommerceEntity entity=(ECommerceEntity) obj;
		System.out.println("Value : "+entity.toString());
		System.out.println("--------------");
		
		Query query2=eManager.createNamedQuery("findByProductName");
		Object obj2=query2.getSingleResult();
		
		ECommerceEntity entity2=(ECommerceEntity) obj2;
		System.out.println("Value :"+entity2.toString());
		System.out.println("---------------");
		
		Query query3=eManager.createNamedQuery("findById");
		Object obj3=query3.getSingleResult();
		
		ECommerceEntity entity3=(ECommerceEntity) obj3;
		System.out.println("Value :"+entity3.toString());
		System.out.println("----------------");
		
		Query query4=eManager.createNamedQuery("findByProductId&ProductName");
		Object obj4= query4.getResultList();
		
		List<ECommerceEntity> res = query4.getResultList();
		
		for(ECommerceEntity ecom : res) {
			System.out.println("Values :"+ecom.getProductId() + " , " + ecom.getProductName());
		}
		System.out.println("-----------------");
		
		Query query5=eManager.createNamedQuery("findByProductName&Category");
		Object obj5=query5.getResultList();
		
		List<ECommerceEntity> res2=query5.getResultList();
		
		for(ECommerceEntity ecomm : res2) {
			System.out.println("Values :"+ ecomm.getProductName() + " , "+ ecomm.getCategory());
		}
		
		try {
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}
		finally {
			eManager.close();
			emFactory.close();
		}
	}

}
