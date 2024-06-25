package com.Programs;

import java.util.Arrays;

public class move0sToTheLeft {
    public static int[] sampleArr = new int[]{1,0,9,0,6,0,5};
    public static int length= sampleArr.length;
    public static int[] newSampleArr = new int[length];
    public static void move0sToTheLeftMethod(int[] sampleA)
    {
        int count = length-1 ;
for(int i = 0 ; i < length ; i++)
{
    if(sampleArr[i]!= 0 )
    {
        newSampleArr[count] = sampleArr[i];
        count--;
    }
}
        System.out.println(Arrays.toString(newSampleArr));
    }

    public static void main(String[] args) {
        move0sToTheLeftMethod(sampleArr);
    }
}
