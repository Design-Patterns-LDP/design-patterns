package com.zemoso.flyweight;

public class FlatBrush implements Brush{

    // Intrinsic
    private final int size;

    // Extrinsic
    private String color;

    FlatBrush(int size) {
        this.size = size;
        System.out.println("----------NEW FLAT BRUSH CREATED OF SIZE " + size + "------------");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void paint() {
        System.out.println("Size " + size + " Flat brush is painting in " + color.toUpperCase() + " color");
    }
}
