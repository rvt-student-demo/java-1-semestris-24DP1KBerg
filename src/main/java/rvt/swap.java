package rvt;

import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;

        // Print original array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Ask for swap indices
        System.out.println("Give two indices to swap:");
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());

        // Swap
        int temp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temp;

        // Print swapped array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}

