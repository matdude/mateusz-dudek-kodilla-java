package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriver {

    public OrderRequest retrive() {
        User user = new User("John", "Doe");
        Product product = new Product("Car", 150000);
        return new OrderRequest(user, product);
    }
}
