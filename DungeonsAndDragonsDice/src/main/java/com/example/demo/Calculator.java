package com.example.demo;

import java.util.Random;

public class Calculator extends D20 {
	private int ac;
	private int defMod;
	private int attMod;
//	private String damageDice;
	private D20 die = new D20();
	private DamageDice damageDie = new DamageDice();
	private int damage;
	int enemysDefense;
	
	public Calculator() {
		this.ac = ac;
		this.defMod = defMod;
		this.attMod = attMod;
//		this.damageDice = damageDice;
		
	}
	
	
	public int attack(int ac, int defMod, int attMod, String damageDice) {
		Random rand = new Random();
		
		//roll the d20
		die.roll(rand);
		int d20 = die.getValue();
		System.out.println("D20: " + d20);
		
		//init enemy's def
		enemysDefense = ac + defMod;

		DamageDice damageDiceOne = new DamageDice();

		
		if(d20 + attMod > enemysDefense) {
			System.out.println("The Attack Lands on enemy!");
			damageDiceOne.roll(damageDice);
			
		} else {
			System.out.println("Attack Misses enemy!");
			System.exit(0);
		}
		
		
		if(d20 == 20) {
			System.out.println("Critical Hit, roll damage twice");
			int damageOne = damageDiceOne.getValue();
			System.out.println("damaged for: " + damageOne);
			DamageDice damageDiceTwo = new DamageDice();
			int damageTwo = damageDiceTwo.roll(damageDice);
			System.out.println("Second attack hits enemy for: " + damageTwo + " damage!");
			
			int rolledA20 = damageOne + damageTwo;

			System.out.println("For a total damage of: " + rolledA20);
			
		}

		if(d20 == 1) {
			damage = 0;
			System.out.println("Citical Miss, 0 damage delt. " + damage + " is delt");
			return damage;
		}
		
		
		if(d20 > 1 && die.getValue() <= 19) {
			damage = damageDiceOne.roll(damageDice);

			System.out.println("Hit enemy for " + damage + " damage!");
		}
				
		return damage;
		
	}

}
