package rvt;

import java.util.Scanner;

public class detalas 
{
    public static void main(String[] arg)
    {   
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skruvju skaits:\n");
        int skruvju = scanner.nextInt();
        System.out.print("Uzgrieznu skaits:\n");
        int uzgriezņu = scanner.nextInt();
        System.out.print("Paplaksnu skaits:\n");
        int paplāksņu = scanner.nextInt();
        
        int salidzinajums = skruvju + uzgriezņu;
        int cena1 = 5 * skruvju;
        int cena2 = 3 * uzgriezņu;
        int cena3 = 1 * paplāksņu;
        int summa = cena1 + cena2 + cena3;

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
