package com.spring.service;

import com.spring.Basket;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    public final Basket basket;
    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }
    @Override
    public void addItems(List<Integer> ID) {
        basket.addItems(ID);
    }

    @Override
    public List<Integer> getItems() {
        return basket.getItems();
    }
}
