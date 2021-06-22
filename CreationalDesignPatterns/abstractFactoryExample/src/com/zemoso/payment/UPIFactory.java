package com.zemoso.payment;

public class UPIFactory implements AbstractFactory<UPI> {
    @Override
    public UPI makePayment(String paymentType) {
        if("gpay".equalsIgnoreCase(paymentType)) {
            return new GPay();
        } else if ("phonepe".equalsIgnoreCase(paymentType)) {
            return new PhonePe();
        } else if("amazonpay".equalsIgnoreCase(paymentType)) {
            return new AmazonPay();
        } else {
            return null;
        }

    }

}
