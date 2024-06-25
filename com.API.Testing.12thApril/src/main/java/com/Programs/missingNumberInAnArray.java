package com.Programs;

public class missingNumberInAnArray {
    public static int[] sampleArray = new int[] { 2, 8, 3, 6, 7, 5, 1 };
    public static int length = sampleArray.length;
    public static int sum = 0;
    public static int sum1 = 0;

    public static void main(String[] args) {
        sum = (length+1)*(length+2)/2;
        System.out.println(sum);
        for (int i = 0; i < sampleArray.length; i++) {
            sum1 = sum1 + sampleArray[i];
        }
        int missingNumber = (sum-sum1);
        System.out.println("Missing number is" + missingNumber);
    }
}
