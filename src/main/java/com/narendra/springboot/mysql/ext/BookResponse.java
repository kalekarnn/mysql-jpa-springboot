package com.narendra.springboot.mysql.ext;

import com.narendra.springboot.mysql.dao.Book;

public class BookResponse {
    private Book book;

    public BookResponse(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookResponse that = (BookResponse) o;

        return book != null ? book.equals(that.book) : that.book == null;
    }

    @Override
    public int hashCode() {
        return book != null ? book.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "BookResponse{" +
                "book=" + book +
                '}';
    }
}
