package rvt;



public class classes 
{
    
    public static void main(String[] args)
    {

        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());

    }

    public static class Statistics {
        private int count;
        private int sum;
  

        public Statistics() {
            count = 0;
            sum = 0;
        }
    
        public void addNumber(int number) {
            count++;
            sum = sum + number;
        }
    
        public int getCount() { 
            return count;
        }

        public int sum() {
            return sum;
        }

        public double average() {
            double average = (double) sum / count;
            return average;
        }
    }   
}
