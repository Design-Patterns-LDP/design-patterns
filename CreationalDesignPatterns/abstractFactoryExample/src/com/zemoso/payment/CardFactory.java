package com.zemoso.payment;

public class CardFactory implements AbstractFactory<Card> {
    @Override
    public Card makePayment(String paymentType) {
        if("Credit".equalsIgnoreCase(paymentType)) {
            return new CreditCard();
        } else if ("Debit".equalsIgnoreCase(paymentType)) {
            return new DebitCard();
        } else {
            return null;
        }

    }
}
