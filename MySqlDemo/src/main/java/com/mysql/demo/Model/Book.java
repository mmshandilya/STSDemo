package com.mysql.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	private String bookName;
	private String bookAuthor;
	/*
	 * public String getBookName() { return bookName; } public void
	 * setBookName(String bookName) { this.bookName = bookName; } public String
	 * getBookAuthor() { return bookAuthor; } public void setBookAuthor(String
	 * bookAuthor) { this.bookAuthor = bookAuthor; }
	 * 
	 * @Override public String toString() { return "Book [bookId=" + bookId +
	 * ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]"; }
	 */
	
	
	
}
