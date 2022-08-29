package com.pootuti.integrador.controller.basic;

import java.util.Calendar;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pootuti.integrador.models.basic.Customer;
import com.pootuti.integrador.models.basic.Gender;
import com.pootuti.integrador.service.basic.ICustomerService;

@RestController
public class CustomerController {

    private ICustomerService customerService;

    @GetMapping("/customers/get")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @PostMapping("/customers/save")
    public void saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
    }

    @DeleteMapping("/customers/delete/{idDelete}")
    public void deleteCustomer(@PathVariable Long idDelete){
        customerService.deleteCustomer(idDelete);
    }

    @GetMapping("/customer/search/{idSearch}")
    public Customer findCustomer(@PathVariable Long idSearch){
        return customerService.findCustomer(idSearch);
    }

    @PutMapping("/customers/edit/idUser")
    public void editCustomer(@PathVariable Long idUser,
                                @RequestParam("names") String newNames,
                                @RequestParam("surnames") String newSurnames,
                                @RequestParam("birthDate") Calendar newBirthDate,
                                @RequestParam("gender") Gender newGender,
                                @RequestParam("joinDate") Calendar newJoinDate){
        Customer customerToEdit = customerService.findCustomer(idUser);

        customerToEdit.setNames(newNames);
        customerToEdit.setSurnames(newSurnames);
        customerToEdit.setBirthDate(newBirthDate);
        customerToEdit.setGender(newGender);
        customerToEdit.setJoinDate(newJoinDate);

        customerService.saveCustomer(customerToEdit);
    }
    
}
