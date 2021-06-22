package com.zemoso.flyweight;

import java.util.Random;

public class PaintApp {
    public static void main(String[] args) {
        String[] types = {"flat", "round"};
        int[] sizes = {3,5};
        String[] colors = {"red", "blue", "green"};

        // Only 2*2=4 objects required
        // Otherwise it would require 2*2*6=24


        BrushFactory brushFactory = new BrushFactory();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {

            int type = random.nextInt(types.length);
            int size = random.nextInt(sizes.length);
            int color = random.nextInt(colors.length);

            Brush brush = brushFactory.getBrush(types[type], sizes[size]);

            brush.setColor(colors[color]);

            brush.paint();
        }
    }
}
