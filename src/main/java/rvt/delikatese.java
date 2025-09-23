package rvt;

import java.util.Scanner;

public class delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String product = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double price = scanner.nextDouble();

        System.out.print("Ekspress piegade (0=ne, 1=jā): ");
        int express = scanner.nextInt();

        double delivery = 0.0;

        if (price < 10) {
            delivery = 2.0;
        }

        if (express == 1) {
            delivery += 3.0;
        }


        double total = price + delivery;

  
        System.out.println("Rekins:");
        System.out.println(product + "  " + price);
        System.out.println("piegade " + delivery);
        System.out.println("kopa " + total);

        scanner.close();
    }
}
