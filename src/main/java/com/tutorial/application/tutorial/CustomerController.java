package com.tutorial.application.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(path = "/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Long saveCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @GetMapping("/customers")
    public List<?> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PutMapping("/update/{id}")
    public Object updateCustomer(@RequestBody Customer customer, @PathVariable Long id){
        return customerService.updateExistingCustomer(customer, id);
    }

    @DeleteMapping("/delete/{id}")
    public Object deleteCustomer(@PathVariable Long id){
        return customerService.deleteExistingCustomer(id);
    }
}
