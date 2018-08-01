package com.elasticsearch.elasticsearch.controller;

import com.elasticsearch.elasticsearch.model.Book;
import com.elasticsearch.elasticsearch.repository.BookRepository;
import com.elasticsearch.elasticsearch.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class BookController {

    private final Logger log = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        log.debug("REST request to update AccidentAndHospitalization : {}", book);


        Book bookJpa = bookService.save(book);
        bookRepository.save(bookJpa);
        return bookJpa;
    }
}
