package com.zemoso.payment;

public class DebitCard implements Card {
    @Override
    public void swipeCard() {
        System.out.println("Swiping the Debit Card");
    }
}
