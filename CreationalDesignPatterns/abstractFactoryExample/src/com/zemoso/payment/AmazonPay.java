package com.zemoso.payment;

public class AmazonPay implements UPI{
    @Override
    public void scanQR() {
        System.out.println("AmazonPay is scanning the QR code!!!");
    }

}

