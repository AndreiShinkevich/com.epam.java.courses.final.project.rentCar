package com.epam.finalproject.repository;

import com.epam.finalproject.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrdersRepository {
    private static OrdersRepository instance = new OrdersRepository();

    private OrdersRepository() {
    }

    public static OrdersRepository getInstance() {
        return instance;
    }


    private List<Order> orders = new ArrayList<>();

    public Order add(Order order) {
        order.setId(orders.size());
        orders.add(order);
        return order;
    }

    public List<Order> getAll() {
        return orders;
    }

    public Order get(int orderId) {
        return orders.stream().filter(e -> e.getId() == orderId).findFirst().orElseThrow();
    }

    public void update() {
        // use db approach
    }
}
