package org.chapter3;

public class Lesson {
    public static void main(String[] args) {
        System.out.println((2+3)*4);
        System.out.println(2+(3*4));
        System.out.println(2+3*4);

        boolean b1 = false;
        boolean b2;
        boolean b3;

        b3=b2=b1;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println(10/4*6%10);
        System.out.println(10/4);

        int x = 4;

        String s = x%2 == 0?"Is an even number" : "Is an odd number";

        System.out.println(s);

        double d1 = 1.23e-9;


    }
}
