package org.chapter3;

public class Chap3_Exercise2 {
    public static void main(String[] args) {
        // Declare the weight of a dinosaur and the food per weight unit
        double dinoWeight = 8000; // in kilograms
        double foodPerWeightUnit = 0.05; // kg of food per kg of dinosaur weight

        // Calculate and print the amount of food needed
        double foodNeeded = dinoWeight * foodPerWeightUnit;
        System.out.println("Food needed for the Dinosaur: " + foodNeeded + " kg");
    }
}
