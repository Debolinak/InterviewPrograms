package com.Programs;

import java.util.Arrays;

public class HighestAndLowestInAnArray {
    public static int[] sampleArr = new int[]{1,8,1,1,6,9,5};
    public static int length= sampleArr.length;
    public static void main(String[] args) {
        int temp = 0;
        for(int i = 0 ; i< length ;i++)
        {
            for(int j = i+1 ; j< length ;j++)
            {
                if(sampleArr[i] > sampleArr[j])
                {
                    temp = sampleArr[i];
                    sampleArr[i] = sampleArr[j];
                    sampleArr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sampleArr));
        System.out.println("The highest is" + sampleArr[length-1]);
        System.out.println("the lowest is" + sampleArr[0]);
    }
}
