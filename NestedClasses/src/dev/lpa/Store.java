package dev.lpa;

public class Store {
    public static void main(String[] args) {
        Meal regularMeal = new Meal();
        System.out.println(regularMeal);
        Meal mealInUSDollars = new Meal(0.68);
        System.out.println(mealInUSDollars);
    }
}
