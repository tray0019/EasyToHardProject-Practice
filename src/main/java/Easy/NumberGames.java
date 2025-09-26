package Easy;

import java.util.Random;
import java.util.Scanner;

/*
 * Guessing number from 1-100
 * Random numbers
 * Maximum guess of 10 try
 * Output high when numAnswer is higher than userAnswer vice versa
 */
public class NumberGames {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int numAnswer = random.nextInt(100)+1;
		int userGuess;
		int numTryLeft = 9;
		
		//System.out.println(numAnswer);
		
		for(int i = 0; i < 10; i++) {
			
			userGuess = sc.nextInt();
			System.out.print(numTryLeft+" left - ");
			if(userGuess == numAnswer) {
				System.out.println("Correct! The answer is "+numAnswer);
			}else if(userGuess > numAnswer){
				System.out.println("Lower");
			}else if(userGuess < numAnswer) {
				System.out.println("Higher");
			}else if(i == 10) {
				System.out.println("You Lost!! ");
			}else {
				System.out.println("Try again!");
			}
			numTryLeft--;
			
		}
		
		
		
	}

}
