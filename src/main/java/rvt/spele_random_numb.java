package rvt;

import java.util.Random;
import java.util.Scanner;

public class spele_random_numb 
{
    
    public static void main(String[] args)
    {

        System.out.println("Guess the number you have 3 tries from 0-10, good luck :)");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(10) + 1;
        int guesses = 0;

        while (true) 
        {

            if (guesses == 3) 
            {
                System.out.println("You failed restart the right answer was: " + answer);
                break;    
            }

            int guess = Integer.valueOf(scanner.nextLine());


            if (guess == answer) 
            {
                
                System.out.println("YOU WON!");
                break;

            }
            else
            {   

                System.out.println("You failed try again");
                guesses++;
            }


            
        }
        scanner.close();

    }

}
