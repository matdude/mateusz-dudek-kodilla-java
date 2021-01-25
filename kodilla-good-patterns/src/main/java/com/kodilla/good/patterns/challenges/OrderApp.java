package com.kodilla.good.patterns.challenges;

public class OrderApp {
    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new MessageSender(),
                new ProductOrder(),
                new OrderCreate());
        orderProcessor.process(orderRequest);
    }
}
