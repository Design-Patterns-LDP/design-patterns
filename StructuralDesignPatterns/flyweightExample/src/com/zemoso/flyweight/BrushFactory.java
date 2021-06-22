package com.zemoso.flyweight;

import java.util.HashMap;

public class BrushFactory {

    private final HashMap<String, Brush> brushMap = new HashMap<>();

    public Brush getBrush(String type, int size) {
        String key = type + size;
        Brush brush = null;

        // If we don't have that type of brush
        if (brushMap.containsKey(key)) {
            brush = brushMap.get(key);
        } else {
            if (type == "flat") {
                brush = new FlatBrush(size);
            } else {
                brush = new RoundBrush(size);
            }
            brushMap.put(key, brush);
        }
        return brush;
    }
}
