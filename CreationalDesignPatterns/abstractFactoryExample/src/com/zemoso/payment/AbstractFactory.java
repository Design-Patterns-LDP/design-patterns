package com.zemoso.payment;

public interface AbstractFactory<T> {
    T makePayment(String paymentType);
}
