package com.basics.datatypes;

public class StringCharacterLength {
    public static void main(String[] args) {
        validateStringLength("Varghese");
    }



static void validateStringLength(String str){
    int i=str.length();
    if(i==8){
        System.out.println("Given string has eight characters");
}
    else{
        System.out.println("Given string has more or less than eight characters");
    }
}
}
