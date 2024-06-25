package com.Programs;

import java.util.Arrays;

public class AddTwoArrays {
    public static int[] sampleArray1 = new int[]{2, 8, 3, 6, 7, 5, 1};
    public static int length1 = sampleArray1.length;
    public static int[] sampleArray2 = new int[]{2, 8, 3, 6, 7};
    public static int length2 = sampleArray2.length;
    public static int length3 = (length1 + length2);
    public static int[] sampleArray3 = new int[length3];

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < length3; i++) {
            if (count < length1) {
                sampleArray3[count] = sampleArray1[i];
                count++;
            }
        }
        int count2 = 0;
        for (int j = length1 - 1; j < length3; j++) {
            if (sampleArray3[j] == 0) {
                sampleArray3[j] = sampleArray2[count2];
                count2++;
            }
        }
        System.out.println(Arrays.toString(sampleArray3));
    }
}
