package com.elasticsearch.elasticsearch.service;

import com.elasticsearch.elasticsearch.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookService extends JpaRepository<Book, Integer> {
//    Book save(Book book);
//
//    void delete(Book book);
//
//    Book findOne(int id);
//
//    List<Book> findAll();

//    Page<Book> findByAuthor(String author, PageRequest pageRequest);
//
//    List<Book> findByTitle(String title);

}
