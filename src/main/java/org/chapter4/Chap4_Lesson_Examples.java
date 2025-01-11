package org.chapter4;

public class Chap4_Lesson_Examples {
    public static void main(String[] args) {
        int a=5,b=5;

        if(a>b)
            System.out.println(a + " > "+ b);
        if(a<b)
            System.out.println(a+" < " + b);
        if(a==b) {
            String s = a + " == " + b;
            System.out.println(s);
        }

        //Above code with else if statements

        if(a>b){
            System.out.println(a + " > " + b );
        } else if ( a<b) {
            System.out.println(a + " < " + b);
        } else if (a==b){
            System.out.println(a + " == " + b);
        }
        System.out.println("Here");

    }
}
