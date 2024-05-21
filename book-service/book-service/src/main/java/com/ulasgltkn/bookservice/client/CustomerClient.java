package com.ulasgltkn.bookservice.client;

import com.ulasgltkn.bookservice.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface CustomerClient {
    @GetExchange("/customer/book/{bookId}")
    public List<Customer> findByCustomerId(@PathVariable("bookId") Long bookId);

}
