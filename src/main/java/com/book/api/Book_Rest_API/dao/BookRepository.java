package com.book.api.Book_Rest_API.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.api.Book_Rest_API.entities.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

    public Book  findById(int id);
    
}
