/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: CheckCalorie.java
 * Description: A delegated segment responsible for checking
 * if the total consumed calorie has met the calorie goal of the user.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

import edu.bu.met.cs665.personal.dietitian.health.goal.CalorieGoal;

import static java.lang.Math.abs;

/**
 * This is the CheckCalorie class.
 * Serves to check if the total consumed calorie
 * has met the user's calorie goal.
 */
public class CheckCalorie implements CheckGoal {
  private final CalorieGoal userCalorieGoal;
  private final Calorie userCalorieConsumption;

  /**
   * The constructor of CheckCalorie.
   *
   * @param calorieGoal = the user's calorie goal
   * @param calorie     = consumed calorie
   */
  public CheckCalorie(CalorieGoal calorieGoal, Calorie calorie) {
    this.userCalorieGoal = calorieGoal;
    this.userCalorieConsumption = calorie;
  }

  /**
   * An override checkGoal method implemented from CheckGoal class.
   */
  @Override
  public void checkGoal() {
    double remain = userCalorieGoal.getTotalCalorieNeed()
        - userCalorieConsumption.calorieConsumption();
    if (remain > 0) {
      System.out.println("Total Calorie Consumption: "
          + userCalorieConsumption.calorieConsumption()
          + "kcal. Still need: "
          + Math.round(remain * 100.0) / 100.0 + "kcal.");
    } else {
      System.out.println("You over consumed calorie by " + abs(Math.round(remain * 100.0) / 100.0));
    }
  }
}
