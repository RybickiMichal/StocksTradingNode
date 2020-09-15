package com.rybicki.stockstradingnode.service;

import com.google.gson.Gson;
import com.rybicki.stockstradingnode.model.OrderDTO;
import com.rybicki.stockstradingnode.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class OrderService {

    private final OrderRepository orderRepository;

    private static Gson gson = new Gson();

    public List<OrderDTO> getOrders() {
        return orderRepository.findAll();
    }


    public void saveOrder(String message) {
        OrderDTO orderDTO = gson.fromJson(message, OrderDTO.class);
        orderRepository.save(orderDTO);
    }

}
