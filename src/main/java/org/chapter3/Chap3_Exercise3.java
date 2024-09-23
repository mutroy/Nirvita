package org.chapter3;

public class Chap3_Exercise3 {
    public static void main(String[] args) {

        int currentYear = 1989;

        String isLeapYear = currentYear % 4 == 0 && (currentYear % 100 != 0 || currentYear % 400 == 0) ? "Is a leap year" : "Is not a leap year";
        System.out.println(isLeapYear);
    }
}
