package com.example.demo.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Orders;
import com.example.demo.Model.Product;
@Repository

public interface OrdersRepo extends JpaRepository<Orders,Integer>{

	Optional<Orders> findById(Integer order_id);

}
