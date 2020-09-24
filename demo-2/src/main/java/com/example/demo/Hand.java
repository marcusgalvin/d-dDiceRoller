package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
	private ArrayList<Die> dice = new ArrayList<>();
	private int size;
	
	public Hand(int size) {
	    size = 6;
		
	}
	
	
	public void rollHand() {
		for(int i = 0; i < 5; i++) {
			Die die = new Die();
			die.roll();
			die.getValue();
			
			dice.add(die);
		}
	}
	

	
	
	public List<Die> displayDice(){
//		String list = dice.toString();
		System.out.println(dice);
		return dice;
	}
	
	
	
	

}
