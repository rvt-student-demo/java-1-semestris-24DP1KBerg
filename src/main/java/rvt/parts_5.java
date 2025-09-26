package rvt;

import java.util.Scanner;

public class parts_5
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a numbers stop when user enters -1: ");
        int numbers = 0;
        int sum = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        while (true) 
        {
            
            
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) 
            {
                break;    
            }

            if (number % 2 == 0) 
            {
                even++;
            }
            else
            {
                odd++;
            }

            sum = sum + number;
            numbers = numbers + 1;
            average = (double) sum / numbers;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        scanner.close();
    }

}
