package com.ulasgltkn.controller;


import com.ulasgltkn.model.Customer;
import com.ulasgltkn.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    public Customer add(@RequestBody Customer customer){
        return customerRepository.addCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Long id){
        return customerRepository.findById(id);
    }
    @GetMapping
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @GetMapping("/book/{bookId}")
    public List<Customer> findByBookId(@PathVariable("bookId") Long bookId){
        return customerRepository.findByCustomerId(bookId);
    }

}
