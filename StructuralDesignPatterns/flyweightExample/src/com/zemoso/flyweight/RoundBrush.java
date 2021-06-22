package com.zemoso.flyweight;

public class RoundBrush implements Brush{

    // Intrinsic
    private final int size;

    // Extrinsic
    private String color;

    RoundBrush(int size) {
        this.size = size;
        System.out.println("----------NEW ROUND BRUSH CREATED OF SIZE " + size + "------------");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void paint() {
        System.out.println("Size " + size + " Round brush is painting in " + color.toUpperCase() + " color");
    }
}
