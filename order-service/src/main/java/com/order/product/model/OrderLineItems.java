package com.order.product.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderLineItems {
    private String id;
    private String skuCode;
    private BigDecimal price;
    private int quantity;
}
