package com.spring.service;

import java.util.List;

public interface OrderService {
    void addItems(List<Integer> ID);

    List<Integer> getItems();
}
