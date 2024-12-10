package com.xworkz.bookStore.service;

import java.util.List;

import com.xworkz.bookStore.entity.BookStoreEntity;

public interface BookStoreService {
	
	public boolean send(List<BookStoreEntity> list);
	
	public double getPrice(String title);
	
	public String getAuthor (String title);
	
	public int getId(double price);
	
	public String getGenre(String author);

}
