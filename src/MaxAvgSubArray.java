/*
Find a contiguous sub array whose length is equal to k that has the maximum average
value and return this value.
//Maximum Average Subarray

======================SLIDING WINDOW ALGO===============
TIME COMPLEXITY : O(N)-BECAUSE WE ITERATED THE ARRAY ONCE TO ITS SIZE
SPACE COMPLEXITY : O(1)-BECAUSE U NEED CONSTANT SPACE TO ARRIVE YOUR ANSWER
*/

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class MaxAvgSubArray {

    public static void main(String[] args) {

        int[] a ={1,12,-5,-6,50,3,0,-45,23};
        //find the length of an array
        int length = a.length;

        //subarray whose length is equal to k(here taking k=4)
        int k = 4;

        //call a function that will return max Avr of subarray whose length is equal to k(here taking k=4)

        double maxSum = findMaxAverage(a,k);

        System.out.println("MAXIMUM AVERAGE OF CONTIGUOUS ARRAY OF SIZE "+k +" : "+maxSum);

    }

    public static double findMaxAverage(int[]a,int k)
    {
        int sum = 0;
        int maxSum =0;
        int startIndex = 0;
        int endIndex = k;

        //adding first 4 contiguas element--{1,12,-5,-6}
        for(int i=0; i<k; i++)
            sum = sum + a[i];

        maxSum = sum;
        while(endIndex < a.length)
        {
            //remove previous element
            sum = sum - a[startIndex];
            startIndex++;

            //adding new element
            sum = sum + a[endIndex];
            endIndex++;

            //max sum
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);

        //return max avg sum
        return (double) maxSum / k;
    }
}
