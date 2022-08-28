package com.pootuti.integrador.service.basic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pootuti.integrador.models.basic.Customer;
import com.pootuti.integrador.repository.basic.CustomerRepository;

@Service
public class CustomerService implements ICustomerService{

    private CustomerRepository customerRepository;
    
    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
        
    }

    @Override
    public void deleteCustomer(Long idUser) {
        customerRepository.deleteById(idUser);
        
    }

    @Override
    public Customer findCustomer(Long idUser) {
        Customer findedCustomer = customerRepository.findById(idUser).orElse(null);
        return findedCustomer;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    
}
