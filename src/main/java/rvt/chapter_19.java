package rvt;

import java.util.Scanner;

public class chapter_19 
{

    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start");
        int numb = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter end");
        int numb2 = Integer.valueOf(scanner.nextLine());
        System.out.println();
        InRange(numb, numb2);
        scanner.close();
    }


    public static void InRange(int start, int end) 
    {  
        int sum = 0;
        int i = start;
        while (i < end + 1) 
        {

            sum = sum + i;
            i++; 
        }
        System.out.println(sum);    
    }
    
}
