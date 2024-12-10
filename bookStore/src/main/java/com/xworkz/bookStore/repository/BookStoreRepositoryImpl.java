package com.xworkz.bookStore.repository;

import java.util.List;
import javax.persistence.*;

import com.xworkz.bookStore.entity.BookStoreEntity;

public class BookStoreRepositoryImpl implements BookStoreRepository {

	@Override
	public boolean save(List<BookStoreEntity> list) {
		System.out.println("Executing save in BookStoreRepositoryImpl");

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("bookstore");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();
			for (BookStoreEntity entity : list) {
				eManager.persist(entity);
			}
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

		return false;
	}

	@Override
	public double getPrice(String title) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("bookstore");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("getPriceByTitle");
		query.setParameter("getTitle", title);
		Object obj=query.getSingleResult();
		Double price= (Double)obj;
		return price;
	}

	@Override
	public String getAuthor(String title) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("bookstore");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("getAuthorByTitle");
		query.setParameter("title", title);
		String author=(String)query.getSingleResult();
		
		return author;
	}

	@Override
	public int getId( double price) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("bookstore");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query= eManager.createNamedQuery("getIdByPrice");
		query.setParameter("byPrice", price);
		Integer id= (Integer)query.getSingleResult();
		
		return id;
	}

	@Override
	public String getGener(String author) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("bookstore");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("getGenreByAuthor");
		query.setParameter("byAuthor", author);
		String authorName=(String)query.getSingleResult();
		
		return authorName;
	}

	

}
