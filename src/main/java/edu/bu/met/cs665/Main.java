/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: Main.java
 * Description: The Main class to run client codes.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.personal.dietitian.diet.journal.*;
import edu.bu.met.cs665.personal.dietitian.health.goal.*;
import edu.bu.met.cs665.personal.dietitian.user.profile.HealthData;
import edu.bu.met.cs665.personal.dietitian.user.profile.UserBMR;
import edu.bu.met.cs665.personal.dietitian.user.profile.UserHealthData;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   */
  public static void main(String[] args) {
    // Create a user profile
    HealthData sarah = new UserHealthData(
        "Sarah", 20, 62.7, 163.6);
    UserBMR sarahBmr = new UserBMR(sarah);
    System.out.println(sarahBmr.getUserProfile());

    // Define diet goals
    final CalorieGoal userCalorieGoal = new CalorieGoal();
    final DietGoalCommand calorieGoal = new CalorieGoalCommand(userCalorieGoal, sarahBmr);
    calorieGoal.makeDietGoals();
    System.out.println("Daily Total Calorie Consumption Recommendation: "
        + Math.round(userCalorieGoal.getTotalCalorieNeed() * 100.0) / 100.0 + "kcal.");

    NutritionGoalsController userNutritionGoals = new NutritionGoalsController(sarah);
    VegetableGoal userVegetableGoals = new VegetableGoal();
    userNutritionGoals.getNutritionGoals(userCalorieGoal);
    userNutritionGoals.getDescription();

    // Document food consumption
    Carbohydrate breakfastCarbohydrate = new Carbohydrate();
    Protein breakfastProtein = new Protein();
    Fat breakfastFat = new Fat();
    Vegetable breakfastVegetable = new Vegetable();
    breakfastCarbohydrate.eatFood("Bagel", 48.0);
    breakfastCarbohydrate.eatFood("Granola Bar", 18.0);
    breakfastFat.eatFood("Butter", 28.0);
    breakfastProtein.eatFood("Hard Boiled Egg", 50.0);
    breakfastVegetable.eatFood("Rainbow Salad", 85.0);

    // Calculate calorie consumption
    Calorie breakfastCalorie = new Calorie(
        breakfastProtein,
        breakfastFat,
        breakfastCarbohydrate,
        breakfastVegetable);
    System.out.println("Consumed Calorie: " + breakfastCalorie.calorieConsumption() + "kcal.");

    // Check nutrition goals
    CheckGoalController mealLog = new CheckGoalController(
        userNutritionGoals.getProteinGoal(),
        userNutritionGoals.getFatGoal(),
        userNutritionGoals.getCarbohydrateGoal(),
        userVegetableGoals,
        userCalorieGoal,
        breakfastProtein,
        breakfastFat,
        breakfastCarbohydrate,
        breakfastVegetable,
        breakfastCalorie);
    mealLog.checkGoal();
  }
}
