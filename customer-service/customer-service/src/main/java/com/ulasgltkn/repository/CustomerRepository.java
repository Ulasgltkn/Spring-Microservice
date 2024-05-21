package com.ulasgltkn.repository;


import com.ulasgltkn.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {

    public List<Customer> customerList = new ArrayList<>();
    public Customer addCustomer(Customer customer){
        customerList.add(customer);
        return customer;
    }

    public Customer findById (Long id){
        return customerList.stream().filter(c -> c.id().equals(id)).findFirst().orElseThrow();
    }
    public List<Customer> findAll(){
        return customerList;
    }

    public List<Customer> findByCustomerId(Long id){
        return customerList.stream().filter(c-> c.bookId().equals(id)).toList();
    }
}
