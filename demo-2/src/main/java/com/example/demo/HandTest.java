package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HandTest {
    private List<Die> dice = new ArrayList<Die>();

    public HandTest(int size) {
        for (int count = 0; count < size; count++ ) {
            dice.add(new Die());
        }
    }

    public void roll() {
    	Random rand = new Random();
    	System.out.println(dice.get(0));
    }

    public List<Die> getDice() {
        return dice;
    }
}
