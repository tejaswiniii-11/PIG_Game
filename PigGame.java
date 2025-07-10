package com.aurionpro.models;

import java.util.Scanner;

public class PigGame {

	public int die;
	public int turnCount = 0;
	public int turnScore;
	public int totalScore = 0;

	public void piggamelogic(Scanner scanner) {
		int max = 6, min = 1;

		while (true) {
			turnCount++;
			turnScore = 0;
			boolean continueTurn = true;

			System.out.println("\nTurn " + turnCount);

			while (continueTurn) {
				System.out.print("Enter Roll or Hold (r/h): ");
				String choice = scanner.nextLine().toLowerCase();

				if (choice.equals("r")) {
					die = min + (int) (Math.random() * (max - min + 1));
					System.out.println("Die: " + die);

					if (die == 1) {
						System.out.println("You rolled a 1! Turn over. No score.");
						turnScore = 0;
						continueTurn = false;
						continue;
					}

					turnScore += die;
					System.out.println("Turn score so far: " + turnScore);

					if (totalScore + turnScore >= 20) {
						totalScore += turnScore;
						printWinMessage();
						return;
					}

					continue;
				}

				if (choice.equals("h")) {
					totalScore += turnScore;
					System.out.println("Score for this turn: " + turnScore);
					System.out.println("Total score so far: " + totalScore);
					continueTurn = false;

					if (totalScore >= 20) {
						printWinMessage();
						return;
					}

					continue;
				}

				System.out.println("Invalid input. Enter 'r' or 'h'.");
			}
		}
	}

	private void printWinMessage() {
		System.out.println("\n Congratulations! You reached " + totalScore + " points.");
		System.out.println("You won the game in " + turnCount + " turns!");
		System.out.println("Game Over!");
	}
}
