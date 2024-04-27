/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: CalorieGoalCommand.java
 * Description: A concrete Command class of DietGoalCommand to
 * wrap command to CalorieGoal.
 */

package edu.bu.met.cs665.personal.dietitian.health.goal;

import edu.bu.met.cs665.personal.dietitian.user.profile.UserBMR;

/**
 * This is the CalorieGoalCommand class.
 * Serves to wrap commands to CalorieGoal objects.
 */
public class CalorieGoalCommand implements DietGoalCommand {
  private final CalorieGoal theCalorieGoal;
  private final UserBMR theUserBMR;

  /**
   * The constructor of CalorieGoalCommand object.
   *
   * @param calorieGoal = user's calorie goal
   * @param userBMR     = user's BMR
   */
  public CalorieGoalCommand(final CalorieGoal calorieGoal, final UserBMR userBMR) {
    this.theCalorieGoal = calorieGoal;
    this.theUserBMR = userBMR;
  }

  /**
   * An override makeDietGoals method implemented from DietGoalCommand.
   */
  @Override
  public void makeDietGoals() {
    double baseCalorie = theUserBMR.getBMR();
    theCalorieGoal.setTotalCalorieNeed(baseCalorie * 1.375);
  }
}
