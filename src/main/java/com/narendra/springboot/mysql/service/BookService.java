package com.narendra.springboot.mysql.service;

import com.narendra.springboot.mysql.dao.Book;
import com.narendra.springboot.mysql.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book getBookById(String isbn) {
        Optional<Book> book = bookRepository.findById(isbn);
        if (book.isPresent())
            return book.get();
       return null;

    }
}
