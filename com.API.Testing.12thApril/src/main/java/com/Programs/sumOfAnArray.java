package com.Programs;

public class sumOfAnArray {
    public static int[] sampleArr = new int[]{1,8,1,1,6,9,5};
    public static int length= sampleArr.length;
    public static int sum = 0;
    public static void main(String[] args) {
        for(int i = 0 ; i < length ; i++){
            sum= sum + sampleArr[i];
        }
        System.out.println(sum);
    }
}
