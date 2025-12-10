package rvt;

import java.util.Scanner;

public class classes 
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        while (true)
        {   
        
           int numbers = scanner.nextInt();
           if (numbers == -1) 
           {
                 break;
           } 
           statistics.addNumber(numbers);
        }
        
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: " + statistics.sumEven());
        System.out.println("Sum of odd numbers: " + statistics.sumOdd());

        scanner.close();

    }

    public static class Statistics {
        private int count;
        private int sum;
        private int even;
        private int odd;

        public Statistics() {
            count = 0;
            sum = 0;
        }
    
        public void addNumber(int number) {
            count++;
            sum = sum + number;
            if(number % 2 == 0){
                even = even + number;
            }
            else{
                odd = odd + number;
            }
        }
    
        public int getCount() { 
            return count;
        }

        public int sum() {
            return sum;
        } 
        public int sumEven(){
            return even;

        }

        public int sumOdd(){
            return odd;
        }

        public double average() {
            double average = (double) sum / count;
            return average;
        }
    }   
}
