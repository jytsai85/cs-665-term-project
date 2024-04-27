/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: VegetableGoal.java
 * Description: The daily goal of required vegetable consumption.
 */

package edu.bu.met.cs665.personal.dietitian.health.goal;

/**
 * This is the VegetableGoal class.
 * Includes the daily required amount of vegetable consumption.
 */
public class VegetableGoal extends NutritionGoal {

  /**
   * An override getGoal method implements from NutritionGoal
   * to get the daily goal of vegetable consumption.
   * The amount is set to 80g * 5 = 400g.
   *
   * @return 400
   */
  @Override
  public double getGoal() {
    return 400;
  }
}
