package com.Programs;

public class reverseString {
public static String name = "DEBOLINA";

    public static void main(String[] args) {
        for(int i = name.length()-1 ; i >=0 ; i--)
        {
            System.out.print(name.charAt(i) + " ");
        }
    }
}
