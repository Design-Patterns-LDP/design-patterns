package com.zemoso.payment;

public class FactoryProvider {
    public static  AbstractFactory getFactory(String choice) {
        if ("Card".equalsIgnoreCase(choice)) {
            return new CardFactory();
        } else if ("UPI".equalsIgnoreCase(choice)) {
            return new UPIFactory();
        } else {
            System.out.println("Invalid factory choice");
            return null;
        }
    }
}
