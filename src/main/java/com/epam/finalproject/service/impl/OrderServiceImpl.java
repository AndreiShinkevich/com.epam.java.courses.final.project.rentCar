package com.epam.finalproject.service.impl;

import com.epam.finalproject.domain.Order;
import com.epam.finalproject.enums.OrderStatus;
import com.epam.finalproject.repository.OrdersRepository;
import com.epam.finalproject.service.OrdersService;

import java.util.List;

public class OrderServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;

    public OrderServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public Order addOrder(Order order) {
        if (ordersRepository.getAll().stream()
                .filter(e -> e.getCarId() == order.getCarId())
                .noneMatch(e -> e.getOrderStatus().equals(OrderStatus.IN_PROCESSING) || e.getOrderStatus().equals(OrderStatus.APPROVED))) {
            ordersRepository.add(order);

        }
        return order;
    }

    @Override
    public List<Order> getOrders() {
        return ordersRepository.getAll();
    }

    @Override
    public Order getOrder(int orderId) {
        return ordersRepository.get(orderId);
    }

    @Override
    public void updateOrder(int orderId, OrderStatus orderStatus) {
        Order order = ordersRepository.get(orderId);
        order.setOrderStatus(orderStatus);
        ordersRepository.update();
    }
}
