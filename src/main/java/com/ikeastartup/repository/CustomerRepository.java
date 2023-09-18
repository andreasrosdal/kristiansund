package com.ikeastartup.repository;

import com.ikeastartup.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
