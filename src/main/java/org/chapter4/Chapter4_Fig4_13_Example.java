package org.chapter4;

import java.util.Scanner;

public class Chapter4_Fig4_13_Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name --> ");
        String nameValue = sc.next();

        int nLetters=0;

        switch(nameValue){

            case "Jane":
            case "Sean":
            case "Alan":
            case "Paul":
                nLetters = 4;
                break;
            case "Janet":
            case "Susan":
                nLetters = 5;
                break;
            case "Maaike":
            case "Alison":
            case "Miriam":
                nLetters = 6;
                break;
            default:
                System.out.println("Unrecognized name: " + nameValue);
                nLetters = -1;
                break;
        }

        System.out.println(nLetters);
    }
}
