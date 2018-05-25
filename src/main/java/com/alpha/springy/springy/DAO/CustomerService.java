package com.alpha.springy.springy.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomersRepository customersRepository;

    Customers readData(int x){
        Customers list = customersRepository.findById(x).get();
        //welcome to your life
        return list;
    }
    Iterable<Customers> readAllData(){
        return customersRepository.findAll();
    }

}
