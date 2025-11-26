package rvt;

import java.util.Scanner;

public class Chapter_44 {

    public static void main(String[] args) {

        //ex1();
        ex2();

    }

    public static void ex1(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        int idx = name.trim().toLowerCase().indexOf(" ");

        String sub = name.substring(idx +1);

        String capital = sub.toUpperCase();

        String lowerCase = name.substring(0, idx + 1);

        String Final = lowerCase.concat(capital);

        System.out.println(Final);

        scanner.close();
    }
    
    public static void ex2(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word:");
        String name = scanner.nextLine();
        scanner.close();
        int  i = 0;

        while (true) {

            char letter = name.charAt(i);
            System.out.println(letter);
            i++;

            if (i > name.length()-1) {
                
                break;

            }
        }

    }
        
}
