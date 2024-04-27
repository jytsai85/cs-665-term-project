/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: CalorieGoal.java
 * Description: The CalorieGoal class to create CalorieGoal object.
 */

package edu.bu.met.cs665.personal.dietitian.health.goal;

/**
 * This is the CalorieGoal class.
 * Includes total calorie a user need daily,
 * calculated from the user's BMR.
 */
public class CalorieGoal {
  private double totalCalorieNeed;

  /**
   * A getter method to get total calorie need.
   *
   * @return user's calorie consumption goal
   */
  public double getTotalCalorieNeed() {
    return totalCalorieNeed;
  }

  /**
   * A setter method to set total calorie need.
   */
  public void setTotalCalorieNeed(double calorieNeed) {
    this.totalCalorieNeed = calorieNeed;
  }

}
