/*
 * Created by: Michael Balcerzak
 * Created on: 29-Sep-2016
 * Created for: ICS4U
 * Weekly Assignment – #2
 * This program make the user play rock paper and scissors with the computer
*/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

		public static String convertToString(int randomNumber, String player){
			//this function change the interger to a string
			
			if (randomNumber == 1){
				player = "rock";
			}
			else if (randomNumber == 2){
				player = "paper";
			}
			else if (randomNumber == 3){
				player = "scissors";
			}
			
			return player;
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		
		
		//varibles
		String userPlayer = "";
		int userRandomNumber = 0;
		String computerPlayer = "";
		int computerRandomNumber = 0;
		
		//make the player enter their choice
		System.out.println("choose rock, paper, or scissors to play againts the computer. 1 as rock, 2 as paper, 3 as scissors");
		userRandomNumber = (int) input.nextDouble();
		
		//make the computer enter their choice
		computerRandomNumber = rnd.nextInt(3) + 1;
		
		//change the interger to a string
		userPlayer = convertToString(userRandomNumber, userPlayer);
		computerPlayer = convertToString(computerRandomNumber, computerPlayer);
		
		//tell who won
		if (userRandomNumber == computerRandomNumber){
			System.out.println("It is a tie");
		}
		else if (((userRandomNumber == 2) && (computerRandomNumber == 1)) || ((userRandomNumber == 3) && (computerRandomNumber == 2)) || ((userRandomNumber == 1) && (computerRandomNumber == 3))){
			System.out.println("the user wins");
		}
		else if (((userRandomNumber == 3/*scissors*/) && (computerRandomNumber == 1/*rock*/)) || ((userRandomNumber == 2/*paper*/) && (computerRandomNumber == 3/*"scissors"*/)) || ((userRandomNumber == 1/*rock*/) && (computerRandomNumber == 2/*paper*/))) {
			System.out.println("the computer wins");
		}
		
		//display what they have
		System.out.println("player has " + userPlayer);
		System.out.println(" and computer has " + computerPlayer);
		
	}

}
