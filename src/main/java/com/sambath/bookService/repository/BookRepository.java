package com.sambath.bookService.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public class BookRepository {
    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public void saveBook(final Book book) {
        dynamoDBMapper.save(book);
    }

    public Book getBookByBookId(final String bookId) {
        final Book book = dynamoDBMapper.load(Book.class, bookId);
        return book;
    }
    public void updateBook(final Book book) {

    }
}
