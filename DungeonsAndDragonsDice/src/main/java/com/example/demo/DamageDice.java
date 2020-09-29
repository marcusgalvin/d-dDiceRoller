package com.example.demo;

import java.util.Random;

public class DamageDice  {
	private int sides;
	private int value;
	String dieConfig;
	String damage;
	
	public DamageDice() {
		super();
		this.sides = 1;
		
	}
		

    public void roll(Random rand) {
        value = rand.nextInt(sides) + 1;      
        
    }
    
    public int roll(String diceConfig) {
//    	String diceConfig = "2d4";

    	Random rand = new Random();
    	int value = 0;
    	
    	int d = diceConfig.indexOf('d');
    	int numberOfSides = 1;
    	
    	String tempMultiplyer = diceConfig.substring(0, d);
    	
    	numberOfSides = Integer.parseInt(diceConfig.substring(d + 1));
//    	System.out.println("number of sides: " + numberOfSides);
    	
    	int numberOfRolls = Integer.parseInt(tempMultiplyer);
//    	System.out.println("number of rolls : " + numberOfRolls);
    	
    	for(int i = 0; i < numberOfRolls; i++) {
    		int roll = rand.nextInt(numberOfSides) + 1;
    		value += roll;

    	}
//    	System.out.println("damage roll value: " + value);

    	return value;
    	
    	
    }

    public int getValue() { 
//    	System.out.println("damage dice: " + value);
        return value;
    }
	
	

}
