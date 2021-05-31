package com.epam.finalproject.service;

import com.epam.finalproject.domain.Order;
import com.epam.finalproject.enums.OrderStatus;

import java.util.List;

public interface OrdersService {

    Order addOrder(Order order);

    List<Order> getOrders();

    Order getOrder(int orderId);

    void updateOrder(int orderId, OrderStatus orderStatus);
}
