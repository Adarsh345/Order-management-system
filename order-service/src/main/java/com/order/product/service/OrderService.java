package com.order.product.service;

import com.order.product.dto.OrderRequest;
import com.order.product.model.Order;
import org.springframework.stereotype.Service;

public interface OrderService {

    Order createOrder(OrderRequest orderRequest);
}
