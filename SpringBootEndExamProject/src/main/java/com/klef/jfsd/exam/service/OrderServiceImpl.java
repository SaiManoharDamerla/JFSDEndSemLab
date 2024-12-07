package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.repository.OrderRepositoty;

@Service
public class OrderServiceImpl  implements OrderService{
	@Autowired
	public OrderRepositoty repo;
	

	@Override
	public List<Order> viewAllOrders() {
		
		return repo.findAll();
	}

}
