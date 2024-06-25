package com.Programs;

import java.util.Arrays;

public class move1sToTheLeft {
    public static int[] sampleArr = new int[]{1,8,1,1,6,9,5};
    public static int length= sampleArr.length;
    public static int[] newSampleArr = new int[length];
    public static void move1sToTheLeftMethod(int[] sampleA)
    {
        int count = length -1;
        for(int i = 0 ; i <length ; i++)
        {
            if(sampleArr[i]!= 1)
            {
                newSampleArr[count] = sampleArr[i];
                count--;
            }
        }
        for(int i = 0 ; i < length ; i++)
        {
            if(newSampleArr[i]==0)
            {
                newSampleArr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(newSampleArr));


    }

    public static void main(String[] args) {
        move1sToTheLeftMethod(sampleArr);
    }
}
