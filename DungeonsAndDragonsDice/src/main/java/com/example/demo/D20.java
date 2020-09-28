package com.example.demo;

import java.util.Random;

public class D20 extends Die {
	private int sides;
	private int value;
	
	public D20() {
		super();
		this.sides = 20;
		this.value = 1;
		
	}
		

    public void roll(Random rand) {
        value = rand.nextInt(sides) + 1;
       
        
    }

    public int getValue() {    	
        return value;
    }
	
	

}
