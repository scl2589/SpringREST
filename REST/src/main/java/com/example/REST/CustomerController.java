package com.example.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/customers")
    public List<Customer> all_customers() {
        return customerService.getAllCustomerList();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable("id") Integer id) {
        return customerService.getCustomer(id);
    }



}
