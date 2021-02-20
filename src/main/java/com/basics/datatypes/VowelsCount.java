package com.basics.datatypes;

public class VowelsCount {
    public static void main(String[] args) {
        countOfVowels("AEIOU are the vowels");
    }

static void countOfVowels(String str) {

    int v = 0;
    for (int i = 0; i<str.length(); i++){
        char c=str.toLowerCase().charAt(i);

    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        v++;

    }
}
    System.out.println(v);
}
}
