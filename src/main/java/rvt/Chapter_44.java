package rvt;

import java.util.Scanner;

public class Chapter_44 {

    public static void main(String[] args) {

        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();
    }

    //excersise 1

    public static void ex1() {

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);
    
        // Ask user for their full name (with first and last name)
        System.out.println("Enter your full name: ");
        String name = scanner.nextLine();
    
        // Find the index of the first space (separates first and last name)
        int idx = name.trim().toLowerCase().indexOf(" ");
    
        // Extract everything after the space → the last name
        String sub = name.substring(idx + 1);
    
        // Convert the last name to upper case
        String capital = sub.toUpperCase();
    
        // Keep the first name in original lowercase form (and keep the space)
        String lowerCase = name.substring(0, idx + 1);
    
        // Join first name + uppercase last name together
        String Final = lowerCase.concat(capital);
    
        // Display the final formatted name
        System.out.println(Final);
    
        // Close scanner to prevent resource leak
        scanner.close();
    }

    //excersise 2

    public static void ex2() {

        // Create the scanner to read user input
        Scanner scanner = new Scanner(System.in);
    
        // Ask the user to enter a word
        System.out.println("Enter your word:");
        String name = scanner.nextLine();
    
        // Close scanner because we no longer need input
        scanner.close();
    
        // Start index at the first character of the string
        int i = 0;
    
        // Infinite loop that we will break manually
        while (true) {
    
            // Get the character at the current index
            char letter = name.charAt(i);
    
            // Print the character
            System.out.println(letter);
    
            // Move to the next character
            i++;
    
            // If index goes past the last character, stop the loop
            if (i > name.length() - 1) {
                break;
            }
        }
    }

    //excersise 3

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
    
        // Print a list of valid names to the user
        System.out.println("List of names:\r\n Amy\r\n Buffy\r\n Cathy\r\n Elroy\r\n Fred\r\n Graham");
    
        while (true) {
            // Ask the user to enter a name
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
    
            // If the user enters an empty line, stop the loop
            if (name.equals("")) {
                break;
            }
    
            // Find the position of the first space in the name
            // This helps separate the first name from the last name
            int firstNameNumber = name.trim().toLowerCase().indexOf(" ");
    
            // Extract the first name using substring
            String firstName = name.substring(0, firstNameNumber);
    
            // Check if the first name belongs to a female list
            if (firstName.equalsIgnoreCase("Amy") || firstName.equalsIgnoreCase("Buffy") || firstName.equalsIgnoreCase("Cathy")) {
    
                // Add "Ms." title and print result
                String female = "Ms. ".concat(name);
                System.out.println(female);
            }
    
            // Check if the first name belongs to a male list
            if (firstName.equalsIgnoreCase("Elroy") || firstName.equalsIgnoreCase("Fred") || firstName.equalsIgnoreCase("Graham")) {
    
                // Add "Mr." title and print result
                String male = "Mr. ".concat(name);
                System.out.println(male);
            }
        }
    
        scanner.close();
    }
    
    //excersise 4

    public static void ex4(){

        // Create the scanner to read user input
        Scanner scanner = new Scanner(System.in);
    
        // Ask the user to enter a timer
        System.out.print("Enter cook time-> ");
        String time = scanner.nextLine();

        scanner.close();

        // Make sure at least 4 digits (MMSS format)
        while (time.length() < 4) {
            time = "0".concat(time);
        }

        // Extract minutes and seconds properly
        String minutes = time.substring(0, 2);
        String seconds = time.substring(2, 4);

        // Build final formatted time
        String FulTime = minutes.concat(":").concat(seconds);
        System.out.println("Your time-> " + FulTime);

    }

    //excersise 5

    public static void ex5() {

        Scanner scanner = new Scanner(System.in);
        
        //Checks if the scanner has anyhing in the next line (use ctrl + z + enter) to stop the programme
        while (scanner.hasNextLine()) { 
            String line = scanner.nextLine();
            
            //If the line starts with // print out the line
            if (line.trim().startsWith("//")) {
                System.out.println(line);
            }
        }
    
        scanner.close();
    }

    //ecersise 6

    public static void ex6(){

        Scanner scanner = new Scanner(System.in);
        
        //Checks if the scanner has anyhing in the next line (use ctrl + z + enter) to stop the programme
        while (scanner.hasNextLine()) { 
            String line = scanner.nextLine();
            
            //If the line starts with // print out the line
            if (line.trim().startsWith("//")) {
                System.out.println(line);
            }

            if (line.trim().startsWith("/*") == true) {
                
                
               if (line.trim().startsWith("*\\") ){
                    break;
               }


                
            }
        }
    
        scanner.close();

    }
}   
