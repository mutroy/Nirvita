package org.chapter3;

public class Chap3_Project_Dino_Meal_Planner {
    public static void main(String[] args) {
        // Declare the dinosaur's weight and the proportion of its weight it needs to eat per day
        double dinoWeight = 2000; // in kilograms
        double dailyProportion = 0.05; // 5% of its body weight

        // Calculate the amount of food needed daily
        double dailyFood = dinoWeight * dailyProportion;

        // Declare the number of feedings per day
        int feedingsPerDay = 2;

        // Calculate and print the amount of food needed per feeding
        double foodPerFeeding = dailyFood / feedingsPerDay;
        System.out.println("Our " + dinoWeight + "kg dinosaur needs to eat " + dailyFood + "kg daily, which means we need to serve " + foodPerFeeding + "kg per feeding.");
    }
}
