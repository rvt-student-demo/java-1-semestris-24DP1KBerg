package rvt;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give number:\n");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) 
        {
            System.out.println("Number is even");    
        }
        else{
            System.out.println("Number is odd");

        }

        scanner.close();
    }
}
