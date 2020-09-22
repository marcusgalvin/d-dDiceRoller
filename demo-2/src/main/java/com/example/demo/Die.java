package com.example.demo;

import java.util.List;
import java.util.Random;

public class Die {
	private int sides = 6;
	private int value;

	//overload to change number of sides
	//set values of fields at the time of instanciation
	public Die() {
		this.value = 1;
	}
	
	public void roll() {
		Random rand = new Random();
		value = rand.nextInt(sides) + 1;
	}
	
	public int getValue() {
		System.out.println(value);
		return value;
		
	}
}
