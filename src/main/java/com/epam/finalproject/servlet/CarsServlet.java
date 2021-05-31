package com.epam.finalproject.servlet;

import com.epam.finalproject.domain.Car;
import com.epam.finalproject.domain.Order;
import com.epam.finalproject.enums.OrderStatus;
import com.epam.finalproject.repository.CarsRepository;
import com.epam.finalproject.repository.OrdersRepository;
import com.epam.finalproject.service.CarsService;
import com.epam.finalproject.service.OrdersService;
import com.epam.finalproject.service.impl.CarsServiceImpl;
import com.epam.finalproject.service.impl.OrderServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@WebServlet(
        name = "carsServlet",
        urlPatterns = "/cars"
)
public class CarsServlet extends HttpServlet {

    private CarsService carsService;
    private OrdersService ordersService;

    @Override
    public void init() {
        carsService = new CarsServiceImpl(new CarsRepository());
        ordersService = new OrderServiceImpl(OrdersRepository.getInstance());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Car> cars = carsService.getAllCars();
        List<Order> orders = ordersService.getOrders();
        Map<String, OrderStatus> carsOrderStatus = cars.stream()
                .map(car -> getOrderStream(orders, car))
                .flatMap(e -> e)
                .collect(Collectors.toMap(e -> String.valueOf(e.getCarId()), Order::getOrderStatus));
        req.setAttribute("carsList", cars);
        req.setAttribute("carsStatus", carsOrderStatus);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cars.jsp");
        dispatcher.forward(req, resp);
    }

    private Stream<Order> getOrderStream(List<Order> orders, Car car) {
        return orders.stream()
                .filter(order -> order.getCarId() == car.getIdCar());
    }
}
