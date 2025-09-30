package rvt;

public class From_paramater_to_one 
{

    public static void main(String[] args)
    {
        printUntilNumber(5);

    }


    public static void printUntilNumber(int numOfTimes) {
        int i = 0;
        while (i < numOfTimes + 1) {
            System.out.println(i);
            i++;
        }
    }
}
