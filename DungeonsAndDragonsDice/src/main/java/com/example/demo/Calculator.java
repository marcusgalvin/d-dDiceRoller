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
	int enemysDefense = ac + attMod;
	
	public Calculator() {
		this.ac = ac;
		this.defMod = defMod;
		this.attMod = attMod;
//		this.damageDice = damageDice;
		
	}
	
	
	
	public void isHit(Random rand) {
		die.roll(rand);
		damageDie.roll(rand);

		System.out.println("D20 Die roll: " + die.getValue());
		if(die.getValue() == 20) {
			System.out.println("Critical Hit!");
		} else if(die.getValue() == 1) {
			System.out.println("Miss!");
		} else {
//			System.out.println("other(non miss), apply mods");
		}
	}
	
	public void attack(int ac, int defMod, int attMod, String damageDice) {
		System.out.println("Enemy Defense value: " + enemysDefense);
		System.out.println("Player's attack modifier: " + attMod);
		
		DamageDice damageDiceOne = new DamageDice();
		damageDiceOne.roll(damageDice);
		
		

		if(die.getValue() == 1) {
			damage = 0;
			System.out.println("Miss, 0 damage delt. " + damage + " is delt");
		}
		
		
		if(die.getValue() > 1 && die.getValue() <= 19) {
			damage = damageDiceOne.roll(damageDice) + attMod;

			System.out.println("Hit enemy for " + damage + " damage!");
		}
		
		if(die.getValue() == 20) {
			damage = damageDiceOne.getValue();
			DamageDice damageDiceTwo = new DamageDice();
			damageDiceTwo.roll(damageDice);
			System.out.println("dd2" + damageDiceTwo.getValue());
			
			int rolledA20 = damageDiceOne.getValue() + damageDiceTwo.getValue();

			System.out.println("die value after mod: " + rolledA20);
			
		}
		
		if(damage + attMod >= enemysDefense) {
			System.out.println("Target Hit");
		}
		
	}

}
