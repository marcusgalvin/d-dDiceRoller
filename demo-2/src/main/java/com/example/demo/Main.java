package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Console text = new Console();
		Hand hand = new Hand(5);
		Scanner in = new Scanner(System.in);
				
		hand.rollHand();
		hand.displayDice();
		
		ArrayList<Integer> keep = new ArrayList<Integer>();
		
		//loop thru twice(yahtzee 3 turns)
		for(int i = 0; i < 2; i++) {
			System.out.println("Would you like to spin again?(yes/no)");
			String answer = in.nextLine();
			if(answer.matches("no")) {
				break;
			}
			System.out.println("Which die do you want to keep? 1 through 5");
			String dicePickedToReRoll = in.nextLine();
			
			String[] input = dicePickedToReRoll.split(" ");
			System.out.println(input);
			
			//loop thru user input
			for(String die : input) {
				if(die.matches("[1-5]")) {
					keep.add(Integer.parseInt(die));
				}
			}
			
			
			System.out.println("keep: " + keep);
			
			
			
			
		}

		

	}

}
