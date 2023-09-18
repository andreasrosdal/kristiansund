package com.ikeastartup.repository;

import com.ikeastartup.model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {

}