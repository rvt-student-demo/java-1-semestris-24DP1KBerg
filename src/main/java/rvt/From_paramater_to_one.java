package rvt;

public class From_paramater_to_one 
{

    public static void main(String[] args)
    {
        divisibleByThreeInRange(3, 9);

    }


    public static void divisibleByThreeInRange(int starting, int ending) {
        int i = starting;
        while (i < ending + 1) {
            if (i % 3 == 0) 
            {
                System.out.println(i);
            }
            
            i++; 
        }
    }
}
