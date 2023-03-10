package com.tutorial.application.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Long createCustomer(Customer customer){
        return customerRepository.save(customer).getId();
    }

    public List<?> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Object updateExistingCustomer(Customer customer, Long id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (!optionalCustomer.isPresent()) return "No customer found with id: " + id;
        customer.setId(id);
        return customerRepository.save(customer);

    }

    public Object deleteExistingCustomer(Long id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (!optionalCustomer.isPresent()) return "No customer found with id: " + id;
        Customer deletedCustomer = optionalCustomer.get();
        customerRepository.deleteById(id);
        return deletedCustomer;

    }
}
