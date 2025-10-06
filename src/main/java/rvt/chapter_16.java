package rvt;

import java.util.Scanner;

public class chapter_16 
{

    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int numb = Integer.valueOf(scanner.nextLine());
        System.out.println();
        InRange(numb);
        scanner.close();
    }


    public static void InRange(int number) 
    {  
        int sum = 0;
        int i = 1;
        while (i < number + 1) {
            int square = i * i;
            sum = sum + square;
            i++; 
        }
        System.out.println(sum);
    }
    
}
