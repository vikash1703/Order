package com.vikash.orderservice.order.service;


import com.vikash.orderservice.order.dto.OrderRequest;
import com.vikash.orderservice.order.dto.OrderResponse;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    OrderResponse create(OrderRequest request);
    OrderResponse getById(UUID id);
    List<OrderResponse> getAll();
    OrderResponse update(UUID id, OrderRequest request);
    void delete(UUID id);
}