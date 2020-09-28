package com.example.demo;

import java.util.List;
import java.util.Random;

public class Die {
    private int sides = 20;
    private int value;

    public Die() {
        this.value = 1;
    }

    public void roll(Random rand) {
        value = rand.nextInt(sides) + 1;
    }

    public int getValue() {
    	System.out.println(value);
    	
        return value;
    }
}
