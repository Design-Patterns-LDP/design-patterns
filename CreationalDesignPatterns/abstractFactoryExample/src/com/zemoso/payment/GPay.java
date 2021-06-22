package com.zemoso.payment;

public class GPay implements UPI {
    @Override
    public void scanQR() {
        System.out.println("GPay is scanning the QR code!!!");
    }

}
