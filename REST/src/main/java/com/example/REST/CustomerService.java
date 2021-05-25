package com.example.REST;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {
    private List<Customer> customerList = new ArrayList<>(Arrays.asList(
            new Customer(1, "Gold", "Lin", "Suji"),
            new Customer(2, "Silver", "Kim", "Bundang"),
            new Customer(3,"Bronze", "Yoon", "Hanam")
    ));

    public List<Customer> getAllCustomerList() {
        return customerList;
    }

    public Customer getCustomer(Integer id) {
        return customerList.stream().filter(customer -> customer.getId() == id).findFirst().get();
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }
}
