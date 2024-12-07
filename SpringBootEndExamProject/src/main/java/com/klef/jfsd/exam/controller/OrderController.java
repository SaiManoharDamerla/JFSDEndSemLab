package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	public OrderService service;
	
	
	
	@GetMapping("/viewall")
	public List<Order> viewAllOrders(){
		return service.viewAllOrders();
	}

}
