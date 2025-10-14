package rvt;

public class chapter_60 
{
        class Exercise5
    {
        public static void main ( String[] args )
        {
            int sum = 0;

            int[] val = {0, 1, 2, 3}; 

            for (int number : val) { 
                sum += number; 
            }
        
            System.out.println( "Sum of all numbers = " + sum );
        
        }
    }   

        class Exercise4
    {
    public static void main ( String[] args )
    {
        int[] val = {13, -4, 82, 17}; 
        int[] twice;
        
        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        // Construct an array object for twice.
        twice = new int[val.length];

        // Put values in twice that are twice the
        // corresponding values in val.
        for (int i = 0; i < val.length; i++) {
        twice[i] = val[i] * 2;
        }

        System.out.println("New Array: " 
            + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
    }
    }

        class Exercise3
    {
    public static void main ( String[] args )
    {
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  0,   0,   0,   0};
        
        // Add values from corresponding cells of valA and valB
        // and put the result in the corresponding cell of sum.
        for(int i = 0; i < valA.length; i++)
        {
            sum[i] = valA[i] + valB[i];
        }


    
        System.out.println( "sum: " 
            + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }
    }

    class Exercise2
{
  public static void main ( String[] args )
  {
    int[] valA   = { 13, -22,  82,  17}; 
    int[] valB   = {  0,   0,   0,   0};
    
    int sum = 0;
    // Put values into valB so that the sum of the values
    // in corresponding cells of valA and valB is 25.

    for(int i = 0; i < valA.length; i++)
        {
            while (sum != 24) 
            {
                sum = valA[i] + valB[i];
                valB[i]++;
            }
            sum = 0;
        }

 
 
    System.out.println( "valA: " 
        + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 
    System.out.println( "valB: " 
        + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

    System.out.println( "sum:  " 
        + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
        + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
   }
}


        class Exercise1
    {
    public static void main (String[] args)
    {
        int[] val = {0, 1, 2, 3}; 
        int temp;

        System.out.println("Original Array: " 
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        // Reverse the order of the numbers in the array
        for (int i = 0; i < val.length / 2; i++) {
        temp = val[i];
        val[i] = val[val.length - 1 - i];
        val[val.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array: " 
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
    }
}
}
