package com.mysql.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysql.demo.Model.Book;

public interface BookRepo extends JpaRepository<Book, Long> {
	public List<Book> findByBookName(String name);
}
