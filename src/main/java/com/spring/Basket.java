package com.spring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Integer> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addItems(List<Integer> ID) {
        items.addAll(ID);
    }

    public List<Integer> getItems() {
        return items;
    }
}
