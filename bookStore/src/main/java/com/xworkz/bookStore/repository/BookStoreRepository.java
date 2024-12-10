package com.xworkz.bookStore.repository;

import java.util.List;

import com.xworkz.bookStore.entity.BookStoreEntity;

public interface BookStoreRepository {
	
	public boolean save(List<BookStoreEntity> list);
	
	public double getPrice(String title);
	
	public String getAuthor(String title);
	
	public int getId(double price);
	
	public String getGener(String author);

}
