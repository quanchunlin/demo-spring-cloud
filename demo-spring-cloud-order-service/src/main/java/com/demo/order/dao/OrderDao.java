package com.demo.order.dao;

import com.demo.common.entity.Order;

public interface OrderDao {
    Order findOneByIdToAllFields(Integer id);
    void create(String name, String status);
}
