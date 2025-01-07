package com.order.product.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderLineItemsDTO {
    private String id;
    private String skuCode;
    private BigDecimal price;
    private int quantity;
}
