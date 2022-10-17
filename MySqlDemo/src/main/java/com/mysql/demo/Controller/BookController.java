package com.mysql.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.demo.Model.Book;
import com.mysql.demo.repository.BookRepo;

@RestController
public class BookController {

	@Autowired
	BookRepo bookrepo;
	@PostMapping("/bookSave")
	public String insertBook(@RequestBody Book book)
	{
		bookrepo.save(book);
		return "Book saved successfully !";
	}
}
