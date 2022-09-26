/*
 * Class: CMSC203 
 * Instructor: Kuijt
 * Description: RNG: This file will generate a random number between 1 and 100.
 * RandomNumberGuesser: Asks the user to guess the random number between 1 and 100.
 * Due: 09/25/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shawn Bearam
*/

import java.util.*;

public class RandomNumberGuesser 
{
	public static void main(String[] args)
	{ 
	final String PROG_NAME = "Shawn Bearam Jr.";
    String choice = "";
    Scanner keyboard = new Scanner(System.in);
    do
    {
        System.out.flush();
        RNG.resetCount();
    		int rand = RNG.rand();
  		  int guess, highGuess, lowGuess, currentCount; 
        boolean inputVal = true;
        lowGuess = 0;
        highGuess = 101;
  		  System.out.println("This application generates a random integer between 0 and 101 and asks the user to guess repeatedly \n \n");
  		  System.out.println("Enter your first guess: ");
  		  guess = keyboard.nextInt();
        //inputVal = RNG.inputValidation(guess, lowGuess, highGuess);
        currentCount = 6 - RNG.getCount();
  		  do
  		  {
          inputVal = RNG.inputValidation(guess, lowGuess, highGuess);
          while (inputVal == false)
          {
            guess = keyboard.nextInt();
            inputVal = RNG.inputValidation(guess, lowGuess, highGuess);
          }
  			  if (guess < rand)
  			  {
            lowGuess = guess;
  				  System.out.println("Your guess is too low\n Number of guesses is: " + currentCount);
  				  System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess + ":");
  			  }
    			else if (guess > rand)
    			{
            highGuess = guess;
    				System.out.println("Your guess is too high\n Number of guesses is: " + currentCount);
    				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess + ":");
    			}
    			guess = keyboard.nextInt();
          //inputVal = RNG.inputValidation(guess, lowGuess, highGuess);
          currentCount = 6 - RNG.getCount();
  		  } while (guess != rand && currentCount != 0);
      keyboard.nextLine();
      if (guess == rand)
      {
        System.out.println("Congratulations, you guessed correctly! Try again? (yes or no) ");
       choice = keyboard.nextLine();
       choice = choice.toLowerCase();
      }
      else 
      {
        System.out.println("You ran out of tries... Try again? (yes or no) ");
        choice = keyboard.nextLine();
        choice = choice.toLowerCase();
      }
	  }while (choice.equals("yes"));
    if (choice.equals("no"))
    {  
    	System.out.println("Programmer: " + PROG_NAME);
    	keyboard.close();
      return;
    }
	
  }
}