package org.chapter4;

import java.util.Scanner;

public class Chapter4_Fig4_16_SwitchexpressionusingYield {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name --> ");
        String nameValue = sc.next();

        int nLetters=0;

        nLetters = switch (nameValue){
            case "Jane","Alan" -> {
                System.out.println("There are 4 letters in: " + nameValue);
                yield 4;
            }
            case "Janet","Susan" -> {
                System.out.println("There are 5 letters in: " + nameValue);
                yield 5;
            }
            case "Maaike" , "Alison" ->{
                System.out.println("There are 6 letters in: " + nameValue);
                yield 6;
            }
                default -> {
                    System.out.println("Invalid Name " + nameValue);
                    yield -1;
                }
        };

        System.out.println(nLetters);

    }
}
