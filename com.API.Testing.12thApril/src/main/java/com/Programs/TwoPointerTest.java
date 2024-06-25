package com.Programs;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class TwoPointerTest {
    public static String sampleString = "HE.LL.OWOR.LD";
    //Output to be DL.RO.WOLL.EH
    public static int length = sampleString.length();
    public static int right = length-1;
    public static int left = 0;

    public static void TwoPointerTestMethod(char[] charA) {
        while (right > left) {
            if (!Character.isAlphabetic(charA[right])) {
                right--;
            } else if (!Character.isAlphabetic(charA[left])) {
                left++;
            } else {
                char temp;
                temp = charA[left];
                charA[left] = charA[right];
                charA[right] = temp;
                right--;
                left++;

            }
        }
    }
    public static void main(String[] args) {
        char[] charArray = sampleString.toCharArray();
        TwoPointerTestMethod(charArray);
        for(char c : charArray)
        {
            System.out.print(c);
        }
        }

    }

