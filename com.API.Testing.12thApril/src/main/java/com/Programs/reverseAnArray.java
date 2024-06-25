package com.Programs;

public class reverseAnArray {
    public static int[] sampleArray = new int[] { 2, 8, 3, 6, 7, 5, 1 };
    public static int length = sampleArray.length;
    public static void main(String[] args) {
        for(int i= length-1 ; i >= 0; i--)
        {
            System.out.print(sampleArray[i] + " ");
        }

    }
}
