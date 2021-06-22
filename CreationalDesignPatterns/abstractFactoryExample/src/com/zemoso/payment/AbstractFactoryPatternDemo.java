package com.zemoso.payment;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Get UPI Factory
        AbstractFactory<UPI> upiFactory = FactoryProvider.getFactory("upi");
        // Get object of UPI factory
        UPI upi = upiFactory.makePayment("gpay");
        upi.scanQR();
        upi = upiFactory.makePayment("phonepe");
        upi.scanQR();
        upi = upiFactory.makePayment("amazonpay");
        upi.scanQR();

        AbstractFactory<Card> cardFactory = FactoryProvider.getFactory("card");
        Card card = cardFactory.makePayment("debit");
        card.swipeCard();
        card = cardFactory.makePayment("credit");
        card.swipeCard();


    }
}
