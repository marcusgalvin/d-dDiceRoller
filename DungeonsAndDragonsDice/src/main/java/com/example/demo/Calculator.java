package com.example.demo;

import java.util.Random;

public class Calculator extends Die {

	private Die d20 = new Die();
	private int damage;
	private int enemysDefense;
	

	
	
	public int attack(int ac, int defMod, int attMod, String damageDice) {
		Random rand = new Random();
		
		//roll the d20
		d20.roll(rand);
		System.out.println("D20: " + d20.getValue());
		
		//init enemy's def
		enemysDefense = ac + defMod;

		Die damageDiceOne = new Die();

		
		if(d20.getValue() + attMod > enemysDefense) {
			System.out.println("The Attack Lands on enemy!");
			damageDiceOne.roll(damageDice);
			
		} else {
			System.out.println("Attack Misses enemy!");
//			System.exit(0);
		}
		
		
		if(d20.getValue() == 20) {
			System.out.println("Critical Hit, roll damage twice");
			
			Die damageAttackOne = new Die();
			int damageAttOne = damageDiceOne.roll(damageDice);
			System.out.println("First attack hits enemy for: " + damageAttOne + " damage!");
			
			
			Die damageDiceTwo = new Die();
			int damageTwo = damageDiceTwo.roll(damageDice);
			System.out.println("The Second attack hits enemy for " + + damageTwo);
			
			int rolledA20 = damageAttOne + damageTwo;

			System.out.println("For a total damage of: " + rolledA20);
			return rolledA20;
		}

		if(d20.getValue() == 1) {
			damage = 0;
			System.out.println("Citical Miss, 0 damage delt. " + damage + " is delt");
			return damage;
		}
		
		
		if(d20.getValue() > 1 && d20.getValue() <= 19) {
			damage = damageDiceOne.roll(damageDice);

			System.out.println("Hit enemy for " + damage + " damage!");
			return damage;
		}
				
		return damage;
		
	}

}
