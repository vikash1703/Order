package com.vikash.orderservice.order.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {
    private String productName;
    private int quantity;
    private double price;
}
