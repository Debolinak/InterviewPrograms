package com.Programs;

import java.sql.SQLOutput;
import java.util.Arrays;

public class testCopperPod {
    public static int[] sampleArr = {1, 5, 6, 7, 7, 7, 3, 3, 4, 2, 1, 1, 0};
    public static int length = sampleArr.length;
    public static void duplicateRemovel(int[] sampleA) {
        int j = 0;
        for (int i = 0; i < length-1; i++) {
            if (sampleArr[i] != sampleA[i + 1]) {
                sampleArr[j] = sampleA[i];
                j++;
            }
        }
        sampleArr[j++] = sampleA[length - 1];
        int[] newSampleArr = new int[j] ;
        for(int i =0; i < j; i++)
        {
            newSampleArr[i] = sampleArr[i];

        }
        System.out.println(Arrays.toString(newSampleArr));
    }

    public static void main(String[] args) {
        duplicateRemovel(sampleArr);

    }
}

