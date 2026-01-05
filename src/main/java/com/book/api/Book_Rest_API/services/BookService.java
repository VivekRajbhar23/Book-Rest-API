package com.book.api.Book_Rest_API.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.api.Book_Rest_API.dao.BookRepository;
import com.book.api.Book_Rest_API.entities.Book;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // private static List<Book> bookList = new ArrayList<>();

    // static{
    //     bookList.add(new Book(101, "Ego", "Ryan Holiday"));
    //     bookList.add(new Book(102, "Atomic Habits", "James Clear"));
    //     bookList.add(new Book(103, "The Alchemist", "Paulo Coelho"));
    // }

    public List<Book> getAllBooks()
    {
        List<Book> bookList = (List<Book>) bookRepository.findAll();
        return bookList;
    }

    public Book getBookById(int id)
    {
        Book book = null;
         book = this.bookRepository.findById(id);
        return book;
    }

    public Book addBook(Book b)
    {
       Book result =  this.bookRepository.save(b);
        return result;
    }

    public void deleteBook(int bookId)
    {
        bookRepository.deleteById(bookId);
    }

    public void updateBook(int bookId, Book book)
     {
            book.setId(bookId);
            bookRepository.save(book);
     }


}
