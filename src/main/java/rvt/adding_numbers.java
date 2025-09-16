package rvt;

import java.util.Scanner;

public class adding_numbers 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int first = 2;
        int second = 4;

        System.out.println(first + second); // prints 6
        System.out.println(2 + second - first - second); // prints 0
        System.out.println();

        //User writes 2 number and prints out their sum
        System.out.println("write your 1st number");
        int number = scanner.nextInt();
        System.out.println("write your 2nd number");
        int number2 = scanner.nextInt();

        int answer = number + number2;

        System.out.println(number + " + " + number2 + " = " + answer);

    }   
}
