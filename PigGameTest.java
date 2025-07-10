package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.PigGame;

public class PigGameTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Let's play PIG!! Lessss go!");
		System.out.println("We calculate the number of turns it takes for you to get score of 20!. If you det dei of 1 then you really lose!");
		System.out.println("All the best!");
		System.out.println("------------------------------------------");
		
		//System.out.println("Enter if you want to roll the die or hold the die! \\(r or h\\)");
		//String choice = scanner.next();
		PigGame pig = new PigGame();
		pig.piggamelogic(scanner);
		
		scanner.close();
		
	}

}
