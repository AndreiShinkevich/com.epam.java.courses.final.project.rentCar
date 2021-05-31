package com.epam.finalproject.servlet;

import com.epam.finalproject.domain.Order;
import com.epam.finalproject.enums.OrderStatus;
import com.epam.finalproject.repository.OrdersRepository;
import com.epam.finalproject.service.OrdersService;
import com.epam.finalproject.service.impl.OrderServiceImpl;
import com.epam.finalproject.utils.SecurityUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/order"})
public class OrderServlet extends HttpServlet {

    private OrdersService ordersService;

    @Override
    public void init() {
        ordersService = new OrderServiceImpl(OrdersRepository.getInstance());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("createOrder")) {
            String parameter = req.getParameter("idCar");
            Integer idCar = Integer.valueOf(parameter);
            int currentUser = SecurityUtils.getCurrentUser();
            Order order = new Order();
            order.setUserId(currentUser);
            order.setCarId(idCar);
            order.setOrderStatus(OrderStatus.IN_PROCESSING);
            ordersService.addOrder(order);
            resp.sendRedirect("cars");
        } else if (action.equals("updateOrder")) {
            String orderId = req.getParameter("orderId");
            String orderStatus = req.getParameter("orderStatus");
            ordersService.updateOrder(Integer.parseInt(orderId), OrderStatus.valueOf(orderStatus));
            resp.sendRedirect("cars");

        }
    }

}
