package com.kodilla.good.patterns.challenges;

public class MessageSender implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Thank you for using our services");
    }
}
