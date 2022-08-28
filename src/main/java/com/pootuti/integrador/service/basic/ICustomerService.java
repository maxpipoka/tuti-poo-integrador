package com.pootuti.integrador.service.basic;

import java.util.List;

import com.pootuti.integrador.models.basic.Customer;

public interface ICustomerService {
    public void saveCustomer(Customer customer);

    public Customer findCustomer(Long idUser);

    public void deleteCustomer(Long idUser);

    public List<Customer> getCustomers();
}
