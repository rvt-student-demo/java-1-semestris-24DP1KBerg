package rvt;

import java.util.Scanner;

public class detalas 
{
    public static void main(String[] arg)
    {   

        final int cena_skruvem = 5;
        final int cena_uzgreizniem = 3;
        final int cena_paplaksnu = 1;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skruvju skaits:\n");
        int skruvju = scanner.nextInt();
        System.out.print("Uzgrieznu skaits:\n");
        int uzgriezņu = scanner.nextInt();
        System.out.print("Paplaksnu skaits:\n");
        int paplāksņu = scanner.nextInt();
        
        int salidzinajums = skruvju + uzgriezņu;
        final int summa = (skruvju * cena_skruvem) + (uzgriezņu * cena_uzgreizniem) + (paplāksņu * cena_paplaksnu);

        if (skruvju < uzgriezņu) 
        {
            System.out.println("Parbaudi pasutijumu: par maz skruvju");
        }
        if (uzgriezņu < skruvju) 
        {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
        }
        if (salidzinajums > paplāksņu * 2) 
        { 
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
        }
        if (skruvju == uzgriezņu && salidzinajums <= paplāksņu * 2) 
        {
            System.out.println("Pasutijums kartiba");
        }

        System.out.println("Kopeja cena: " + summa);

        scanner.close();

    }
}
