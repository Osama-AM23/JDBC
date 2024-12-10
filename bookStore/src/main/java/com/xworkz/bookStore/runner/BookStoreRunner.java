package com.xworkz.bookStore.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.bookStore.entity.BookStoreEntity;
import com.xworkz.bookStore.service.BookStoreService;
import com.xworkz.bookStore.service.BookStoreServiceImpl;

public class BookStoreRunner {

	public static void main(String[] args) {
//		List<BookStoreEntity> list = new ArrayList<BookStoreEntity>();
//		list.add(new BookStoreEntity(2301, "Atomic Habits", "James Clear", "Self-Help", 1699));
//		list.add(new BookStoreEntity(9743, "The 4-Hour Body", "Tim Ferriss", "Relationships", 2000));
//		list.add(new BookStoreEntity(2109, "The Five Love Languages", "Gary Chapman", "Relationships", 1250));
//		list.add(new BookStoreEntity(4895, "The Midnight Library", "Matt Haig", "Fiction", 1320));
//		list.add(new BookStoreEntity(9021, "Educated", "Tara Westover", "Memoir", 1100));
//		list.add(new BookStoreEntity(2004, "Come as You Are", "Emily Nagoski", "Relationships", 1440));
//		list.add(new BookStoreEntity(1999, "The Psychology of Money", "Morgan Housel", "Behavioral Economics", 720));
//		list.add(new BookStoreEntity(2309, "The Millionaire Next Door", "Thomas J. Stanley", " Wealth Building", 800));
//		list.add(new BookStoreEntity(9219, "Rich Dad Poor Dad", "Robert T. Kiyosaki", "Financial Literacy", 899));
//		list.add(new BookStoreEntity(8043, " The Night Circus", " Erin Morgenstern", "Romance", 1599));
//		
//		BookStoreService service= new BookStoreServiceImpl();
//		service.send(list);
		
		BookStoreService  service2= new BookStoreServiceImpl();
		double price=service2.getPrice("Atomic Habits");
		System.out.println( "Price : "+price);
		
		BookStoreService service3= new BookStoreServiceImpl();
		String author=service3.getAuthor("The Five Love Languages");
		System.out.println("Author :"+author);
		
		BookStoreService service4= new BookStoreServiceImpl();
		int id=service4.getId(1599);
		System.out.println("Id : "+id);
		
		BookStoreService service5= new BookStoreServiceImpl();
		String getAuthor=service5.getGenre(" Erin Morgenstern");
		System.out.println("Author :"+getAuthor);

	}

}
