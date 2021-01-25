package com.kodilla.good.patterns.challenges;

public class OrderCreate implements OrderRepository {

    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Order is created");
    }
}
