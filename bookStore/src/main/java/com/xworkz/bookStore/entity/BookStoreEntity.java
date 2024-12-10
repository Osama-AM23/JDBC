package com.xworkz.bookStore.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "books_table")
@Data
@NoArgsConstructor

@NamedQuery(name="getPriceByTitle", query="Select bs.price From BookStoreEntity bs Where bs.title= :getTitle")

@NamedQuery(name="getAuthorByTitle", query="Select bs.author from BookStoreEntity bs where bs.title= :title")

@NamedQuery(name="getIdByPrice", query="Select bs.id From BookStoreEntity bs Where bs.price= :byPrice")

@NamedQuery(name="getGenreByAuthor", query="Select bs.genre From BookStoreEntity bs Where bs.author= :byAuthor")
public class BookStoreEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "book_id")
	private int bookId;

	private String title;

	private String author;

	private String genre;

	private double price;

	public BookStoreEntity(int bookId, String title, String author, String genre, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
	}

}
