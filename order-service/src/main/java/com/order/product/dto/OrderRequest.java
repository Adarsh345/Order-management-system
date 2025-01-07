package com.order.product.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    List<OrderLineItemsDTO> orderLineItemsDTOList;
}
