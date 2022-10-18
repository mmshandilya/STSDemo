package com.mysql.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.demo.Model.Book;
import com.mysql.demo.repository.BookRepo;

@RestController
public class BookController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	@Autowired
	BookRepo bookrepo;

	@PostMapping("/bookSave")
	public String insertBook(@RequestBody Book book) {
		bookrepo.save(book);
		return "Book saved successfully !";
	}

	@PostMapping("/bookAllSave")
	public String insertBook(@RequestBody List<Book> book) {
		bookrepo.saveAll(book);
		return "Books Saved Successfully !!";
	}

	@GetMapping("/getAllBook")
	public List<Book> getAllBooks() {
		
		return (List<Book>) bookrepo.findAll();
	}

	@GetMapping("/getBookByName/{name}")
	public List<Book> getBook(@PathVariable("name") String bookname) {
		logger.debug("Hello from Logback {}", bookname);
		return (List<Book>) bookrepo.findByBookName(bookname);
	}

	@GetMapping("/getBookById/{bookid}")
	public Optional<Book> getBookById(@PathVariable("bookid") Long bookid) {
		return bookrepo.findById(bookid);
	}
}
