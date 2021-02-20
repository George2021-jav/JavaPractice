package com.basics.datatypes;

public class ReplaceWord {
    public static void main(String[] args) {
        replaceString("I am learning C++ programming");

    }


    static void replaceString(String str) {
        String s = str.replace("C++", "Java");
        System.out.println(s);
    }
}
