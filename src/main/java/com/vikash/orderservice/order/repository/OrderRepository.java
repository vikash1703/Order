package com.vikash.orderservice.order.repository;

import com.vikash.orderservice.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {}