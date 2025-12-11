package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList 
{
    public static void main(String[] args) 
    {
      onlyTheseNumber();
      listSize();
      onTheList();
      testRemoveLast();
    }



    public static void onlyTheseNumber()
    {
      // ssss
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

   public static void onTheList()
   {

    Scanner scanner = new Scanner(System.in);
      ArrayList<String> names = new ArrayList<>();
      String name;
      while (true) 
      {
        name = scanner.nextLine(); 

        if (name == "") 
        {   
            break;
        } else {
            names.add(name);
        }
      }
      System.out.print("Search for: ");
      String search = scanner.nextLine();

      if (names.contains(search)) 
      {
        System.out.println(search + " was found!");
      }
      else
      {
        System.out.println(search + " was NOT found!");
      }
      scanner.close();
   }



   public static void removeLast(ArrayList<String> strings)
    {
      if (!strings.isEmpty()) 
        {
          strings.remove(strings.size() - 1);
        }
    }

    public static void testRemoveLast() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
  }
}



