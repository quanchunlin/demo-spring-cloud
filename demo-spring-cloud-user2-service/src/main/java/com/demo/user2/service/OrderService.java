package com.demo.user2.service;

import com.demo.common.entity.Order;
import com.demo.user2.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderClient orderClient;

    public Order getOrder(final Integer id) {
        return orderClient.getOrder(id);
    }

}
