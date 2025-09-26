package rvt;

import java.util.Scanner;

public class counting 
{
    
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int numb = Integer.valueOf(scanner.nextLine());

        scanner.close();

        for (int i = 0; i < numb+1; i++)
        {

            System.out.println(i);

        }

        
    }

}
