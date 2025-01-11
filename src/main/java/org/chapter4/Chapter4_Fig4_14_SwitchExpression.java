package org.chapter4;

import java.util.Scanner;

public class Chapter4_Fig4_14_SwitchExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name --> ");
        String nameValue = sc.next();

        int nLetters=0;

        nLetters = switch(nameValue){
            case "Jane", "Sean", "Alan", "Paul" -> 4;
            case "Janet", "Susan" -> 5;
            case "Maaike" , "Alison" , "Miriam" -> 6;

            default -> {
                System.out.println("Unrecognized Name : " + nameValue);
                yield -1;
            }

        };

        System.out.println(nLetters);
    }
}
