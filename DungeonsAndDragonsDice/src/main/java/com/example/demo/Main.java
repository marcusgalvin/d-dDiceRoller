package com.example.demo;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		Calculator calc = new Calculator();
		
		
//		calc.isHit(rand);
		
		calc.attack(1, 1, 1, "2d4");

//		DamageDice test = new DamageDice();
//		test.roll("2d4");
	}

}
