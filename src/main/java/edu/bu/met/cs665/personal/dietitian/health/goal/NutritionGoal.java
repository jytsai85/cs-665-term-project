/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: NutritionGoal.java
 * Description: The NutritionGoal abstract class to
 * serve as the Template of all nutrition goals.
 */

package edu.bu.met.cs665.personal.dietitian.health.goal;

/**
 * This is the NutritionGoal class.
 * The abstract parent template of all other nutrition goals.
 */
public abstract class NutritionGoal {
  double dailyNutritionNeed;

  public void setGoal(double nutrition) {
    this.dailyNutritionNeed = nutrition;
  }

  public double getGoal() {
    return this.dailyNutritionNeed;
  }
}
