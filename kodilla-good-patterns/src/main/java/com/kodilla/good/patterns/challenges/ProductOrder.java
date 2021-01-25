package com.kodilla.good.patterns.challenges;

public class ProductOrder implements OrderService {

    public boolean order (final User user, final Product product) {
        System.out.println("User: "  + user.getUserName() + " " + user.getUserLastName() + " ordered product: " + product.getProductName() + " for" + " " + product.getPrice());
        return true;
    }
}
