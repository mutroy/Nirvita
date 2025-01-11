package org.chapter4;

import java.util.Scanner;

public class Chapter4_Fig4_17_Switchstatementusingnewcaselabels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name --> ");
        String nameValue = sc.next();

        int nLetters=0;

        switch (nameValue){
            case "Jane" , "Sean" -> nLetters =4;
            case "Janet" , "Susan" -> nLetters = 5;
            case "Maaike" , "Alison" -> nLetters = 6;
            default -> {
                System.out.println("Invalid Name : " + nameValue);
                nLetters = -1;
            }
        }

        System.out.println(nLetters);
    }
}
