package org.chapter4;

import java.util.Scanner;

public class Chapter4_Fig4_10_Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 10 --> ");
        int value = sc.nextInt();

        // final int two = 2; If we omit final it is an error as constant expression is required
        final int two = 2;
        switch (value){
            case 1: case 3: case 5: case 7: case 9:
                System.out.println( value + " is an ODD number ");
                break;
            case two: case 4: case 6: case 8: case 10:
                System.out.println( value + " is an EVEN number");
                break;
            default:
                System.out.println("Unknown Value");
                break;
        }
    }
}
