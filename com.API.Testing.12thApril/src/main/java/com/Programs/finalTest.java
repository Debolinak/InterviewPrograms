package com.Programs;

import java.util.Arrays;

public class finalTest {
    public static void main(String[] args) {
        int [] arr = new int[]{2,4,3,5,6};
        int j=0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i]%2 == 0)
            {
                arr[j] = arr[i];
                j++;
            }
            else {
                arr[j] = arr[i]+1;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
