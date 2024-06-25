package com.Programs;

import java.util.Arrays;

public class sortAnArray {
    public static int[] sampleArr = new int[]{1,8,1,1,6,9,5};
    public static int length= sampleArr.length;
   // public static int[] newSampleArr = new int[length];
    public static void sampleArrMethod(int [] sampleA)
    {
        for(int i = 0 ;i < length ; i++)
        {
            for(int j = i+1 ; j < length ; j++)
            {
                int temp = 0 ;
                if(sampleArr[i]>sampleArr[j])
                {
                    temp = sampleArr[i];
                    sampleArr[i] = sampleArr[j];
                    sampleArr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sampleArr));
    }
    public static void main(String[] args) {
        sampleArrMethod(sampleArr);
    }
}
