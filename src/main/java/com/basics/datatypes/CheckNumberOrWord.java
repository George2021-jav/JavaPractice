package com.basics.datatypes;

public class CheckNumberOrWord {
    public static void main(String[] args) {
        isStringNumberORWord("12345");
    }


static void isStringNumberORWord(String str){
    try {
        Double D= Double.parseDouble(str);
        System.out.println("Given string is a number");
    }
    catch(NumberFormatException e){
        System.out.println("Given string is word");

    }




}

}

