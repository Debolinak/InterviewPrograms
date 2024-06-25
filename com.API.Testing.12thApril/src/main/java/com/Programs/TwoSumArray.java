package com.Programs;

public class TwoSumArray {
    public static int[] sampleArray1 = new int[]{2, 8, 3, 6, 7, 5, 1};
    public static int length1 = sampleArray1.length;
    public static int twoSum = 9;
    public static void main(String[] args) {
        for(int i = 0; i < length1; i++)
        {
            for(int j = i+1; j < length1; j++)
            {
                if((sampleArray1[i]+ sampleArray1[j])== twoSum)
                {
                    System.out.println("The elements are :: " + sampleArray1[i] + " "+ sampleArray1[j]);
                }
            }
        }

    }
}
