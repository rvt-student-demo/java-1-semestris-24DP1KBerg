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



    }

    public static class Statistics {
        private int count;


        public Statistics() {
            count = 0;
        }
    
        public void addNumber(int number) {
            count++;
        }
    
        public int getCount() { 
            return count;
        }
    }
}
