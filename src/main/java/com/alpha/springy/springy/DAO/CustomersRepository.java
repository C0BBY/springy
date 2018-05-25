package com.alpha.springy.springy.DAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    interface CustomersRepository extends CrudRepository<Customers, Integer> {
    }



