package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        String greeting = "Hello, World!";
        System.out.println(greeting);
        int number = 5;
        int doubled = doubleNumber(number);
        System.out.println("The doubled number is: " + doubled);
    }

    public static int doubleNumber(int input){
        return input*2;
    }
}