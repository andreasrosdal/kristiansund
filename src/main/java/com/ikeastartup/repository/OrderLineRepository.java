package com.ikeastartup.repository;

import com.ikeastartup.model.OrderLine;
import com.ikeastartup.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderLineRepository extends CrudRepository<OrderLine, Integer>{

    List<OrderLine> findByOrders(Orders orders);

}
