package com.Programs;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedCharactersInString {
    public static String sampleString = "DDEBOLLINA";
    public static int length = sampleString.length();

    public static void main(String[] args) {
        Map<Character , Integer> cntrMap = new HashMap<>();
        for(int i = 0 ; i < length ; i++)
        {
            Integer integer = cntrMap.get(sampleString.charAt(i));
            if(integer == null)
            {
                cntrMap.put(sampleString.charAt(i), 1);
            }
            else {
                cntrMap.put(sampleString.charAt(i), integer+1);
            }
        }
        System.out.println(cntrMap);
    }
}
