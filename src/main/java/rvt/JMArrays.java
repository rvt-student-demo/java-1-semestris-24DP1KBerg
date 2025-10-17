package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrays {
    public static void main(String[] args) 
    {
        onlyTheseNumber();
        listSize();
    }



    public static void onlyTheseNumber()
    {

        Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<>();
      int i =0;
      int addNumbers = 0;
      int range = 0;
      while (addNumbers != -1) 
      {
      
        addNumbers = scanner.nextInt(); 
        numbers.add(addNumbers);
        range++;
      }

      
      while (i <= range - 1) 
      {
         int number = numbers.get(i);
         System.out.println(number);
         i++;
      }
      System.out.println();

      System.out.print("From where? ");
      int start = scanner.nextInt();
      System.out.print("To where? ");
      int end = scanner.nextInt();

      System.out.println();
      while (start <= end) 
      {
        int number = numbers.get(start);
        System.out.println(number);
        start++;
      }
      scanner.close();

   }



   public static void listSize()
   {

    Scanner scanner = new Scanner(System.in);
      ArrayList<String> numbers = new ArrayList<>();
      String name;
      while (true) 
      {
        name = scanner.nextLine(); 

        if (name == "") 
        {   
            break;
        } else {
            numbers.add(name);
        }
      }
      System.out.println("In total: " + numbers.size());
      scanner.close();
   }

}



