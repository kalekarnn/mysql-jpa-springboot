package com.narendra.springboot.mysql.controller;

import com.narendra.springboot.mysql.ext.BookResponse;
import com.narendra.springboot.mysql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/{isbn}")
    public BookResponse getBookById(@PathVariable String isbn) {

        return new BookResponse(bookService.getBookById(isbn));
    }
}
