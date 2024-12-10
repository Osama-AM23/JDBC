package com.xworkz.bookStore.service;

import java.util.List;

import com.xworkz.bookStore.entity.BookStoreEntity;
import com.xworkz.bookStore.repository.BookStoreRepository;
import com.xworkz.bookStore.repository.BookStoreRepositoryImpl;

public class BookStoreServiceImpl implements BookStoreService {

	@Override
	public boolean send(List<BookStoreEntity> list) {
		System.out.println("Executing send in BookStoreServiceImpl");

		BookStoreRepository repository = new BookStoreRepositoryImpl();
		repository.save(list);
		return true;
	}

	@Override
	public double getPrice(String title) {

		BookStoreRepository repository = new BookStoreRepositoryImpl();
		repository.getPrice(title);

		return repository.getPrice(title);
	}

	@Override
	public String getAuthor(String title) {

		BookStoreRepository repository = new BookStoreRepositoryImpl();
		repository.getAuthor(title);

		return repository.getAuthor(title);
	}

	@Override
	public int getId(double price) {

		BookStoreRepository repository = new BookStoreRepositoryImpl();
		repository.getId(price);
		return repository.getId(price);
	}

	@Override
	public String getGenre(String author) {
		
		BookStoreRepository repository = new BookStoreRepositoryImpl();
		repository.getGener(author);
		return repository.getGener(author);
	}

}
