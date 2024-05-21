package com.ulasgltkn.bookservice.controller;

import com.ulasgltkn.bookservice.client.CustomerClient;
import com.ulasgltkn.bookservice.model.Book;
import com.ulasgltkn.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    CustomerClient customerClient;

    @PostMapping
    public Book add(@RequestBody Book book){
        return bookRepository.addBook(book);
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable("id") Long id){
        return bookRepository.findById(id);
    }
    @GetMapping
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    @GetMapping("/with-customers")
    public List<Book> findAllWithCustomer(){
        List<Book> bookList = bookRepository.findAll();
        bookList.forEach(c-> c.setCustomerList(customerClient.findByCustomerId(c.getId())));
        return bookList;
    }

}
