package com.example.demo;

import java.util.Scanner;

public class Console {
	
	Scanner in = new Scanner(System.in);
	
	public void promptUserForTurn() {
		for(int i = 0; i < 2; i++) {
		System.out.println("Would you like to spin again?(yes/no)");
		String answer = in.nextLine();
		if(answer.matches("no")) {
			break;
		}
		System.out.println("Which die do you want to re roll?");
		String reRoll = in.nextLine();
		}
	}

}
