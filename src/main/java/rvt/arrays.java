package rvt;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;

        // Print array the first time
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Ask the user for two indices
        System.out.println("Give two indices to swap:");
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());

        // Swap the values
        int temp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temp;

        // Print array the second time
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}