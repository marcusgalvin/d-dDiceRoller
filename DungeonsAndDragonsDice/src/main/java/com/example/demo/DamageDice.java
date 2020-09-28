package com.example.demo;

import java.util.Random;

public class DamageDice extends Die {
	private int sides;
	private int value;
	private int test;
	String dieConfig;
	String damage;
	
	public DamageDice() {
		super();
		this.sides = 1;
		this.test = test;
		
	}
		

    public void roll(Random rand) {
        value = rand.nextInt(sides) + 1;
       
        
    }
    
    public int roll(String diceConfig) {
    	Random rand = new Random();
//    	String dieConfig = "2d4";
    	int value = 0;
    	
    	int d = diceConfig.indexOf('d');
    	int numberOfSides = 1;
    	String tempMultiplyer = diceConfig.substring(0, d);
    	
    	numberOfSides = Integer.parseInt(diceConfig.substring(d + 1));
//    	System.out.println("number of sides: " + numberOfSides);
    	
    	int test = Integer.parseInt(tempMultiplyer);
//    	System.out.println("multiplyer : " + test);
    	
    	for(int i = 0; i <= test; i++) {
    		int rollDice = rand.nextInt(numberOfSides) + 1;
    		value += rollDice;

    	}
    	System.out.println("damage roll value: " + value);

    	return value;
    	
    	
    }

    public int getValue() { 
//    	System.out.println("damage dice: " + value);
        return value;
    }
	
	

}
