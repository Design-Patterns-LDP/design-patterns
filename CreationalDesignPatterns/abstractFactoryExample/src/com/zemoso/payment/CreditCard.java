package com.zemoso.payment;

public class CreditCard implements Card {
    @Override
    public void swipeCard() {
        System.out.println("Swiping the Credit Card");
    }
}
