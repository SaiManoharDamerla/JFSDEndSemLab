package com.klef.jfsd.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.exam.model.Order;

public interface OrderRepositoty extends JpaRepository<Order, Integer>{

}