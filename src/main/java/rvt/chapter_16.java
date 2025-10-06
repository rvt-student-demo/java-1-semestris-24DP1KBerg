package rvt;

import java.util.Scanner;

public class chapter_16 
{

    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter end");
        int last = Integer.valueOf(scanner.nextLine());
        System.out.println();
        InRange(first, last);
        scanner.close();
    }


    public static void InRange(int starting, int ending) {  
        int i = starting;
        while (i < ending + 1) {
            System.out.println(i);
            i++; 
        }
    }
    
}
