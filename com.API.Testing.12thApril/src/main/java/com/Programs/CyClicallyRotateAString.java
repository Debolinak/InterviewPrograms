package com.Programs;

public class CyClicallyRotateAString {
    public static String sampleString = "DEBOLINA";
    public static int length = sampleString.length();
    public static int index = 2;
    public static void tillIndexMethod()
    {
        String newString = sampleString.substring(index,length) + sampleString.substring(0,index);
        System.out.println(newString);
    }
    public static void cyClicallyRotateAStringMethod(String sampleStr)
    {
        String newString = "";
        for(int i = 0; i < length; i++)
        {
            newString = sampleString.charAt(length-1) + sampleString.substring(0,length-1);
            System.out.println(newString);
            sampleString = newString;
        }
    }
    public static void main(String[] args) {
        //tillIndexMethod();
        cyClicallyRotateAStringMethod(sampleString);

    }

}
