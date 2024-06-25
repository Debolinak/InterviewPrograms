package com.Programs;

public class RemoveDuplicatesFromString {
    public static String sampleStr = "DDEBBBBBOLLINA";
    public static int length = sampleStr.length();
    public static String tempStr = "";
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0 ; i < length ; i++)
        {
        if(!tempStr.contains(String.valueOf(sampleStr.charAt(i))))
        {
            tempStr = tempStr + sampleStr.charAt(i);
        }
        }
        System.out.println(tempStr);
    }
}
