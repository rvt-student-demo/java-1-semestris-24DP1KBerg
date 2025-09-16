package rvt;

import java.util.Scanner;

public class adding_numbers 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        
        int firstd = 2;
        int secondd = 4;

        System.out.println(firstd + secondd); // prints 6
        System.out.println(2 + secondd - firstd - secondd); // prints 0
        System.out.println();

        //User writes 2 number and prints out their sum
        System.out.println("write your 1st number");
        int number = scanner.nextInt();
        System.out.println("write your 2nd number");
        int number2 = scanner.nextInt();

        int answer = number + number2;

        System.out.println(number + " + " + number2 + " = " + answer);
        
        
        //Division
        /*
         *  int first = 3;
            int second = 2;
            double result = first / second;        Skat. prioritāšu lapā
            System.out.println(result);

            atbilde: 1.0
         */

            System.out.println();
            int first = 3;
            int second = 2;
            //double result = Double.valueOf(first) / Double.valueOf(second);       1. variants
            //double result = (double) first / second;      1. variants
            double result = 1.0 * first / second;
            System.out.println(result);

            //average of 3 numbers

        System.out.println("write your 1st number");
        int averagenumber = scanner.nextInt();
        System.out.println("write your 2nd number");
        int averagenumber2 = scanner.nextInt();
        System.out.println("write your 3rd number");
        int averagenumber3 = scanner.nextInt();

        double sum = averagenumber + averagenumber2 + averagenumber3; // var arī ar int kā sum un pēc tam double average = (double) / 3;

        double average = sum / 3;

        System.out.println("Average: " + average);

    }   
}
