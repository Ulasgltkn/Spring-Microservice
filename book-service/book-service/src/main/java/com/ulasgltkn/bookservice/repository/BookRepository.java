package com.ulasgltkn.bookservice.repository;

import com.ulasgltkn.bookservice.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BookRepository {

    public List<Book> bookList = new ArrayList<>();
    public Book addBook(Book book){
        bookList.add(book);
        return book;
    }

    public Book findById (Long id){
        return bookList.stream().filter(c -> c.getId().equals(id)).findFirst().orElseThrow();
    }
    public List<Book> findAll(){
        return bookList;
    }
}
