package com.examples.core;

public class IfElseDemo {
    public static void main(String[] args) {
        int number = 25;
        int reminder = number%2;
        System.out.println("reminder = " + reminder);

        if(reminder==0) {
            System.out.println("THIS IS AN EVEN NUMBER");
        }
        else{
            System.out.println("THIS IS AN ODD NUMBER");
        }
    }
}
