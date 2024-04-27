/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: FatGoalCommand.java
 * Description: A concrete Command class of DietGoalCommand to
 * wrap command to FatGoal.
 */

package edu.bu.met.cs665.personal.dietitian.health.goal;

/**
 * This is the FatGoalCommand class.
 * Serves to wrap commands to FatGoal objects.
 */
public class FatGoalCommand implements DietGoalCommand {
  private final FatGoal theFatGoal;
  private final CalorieGoal theCalorieGoal;

  /**
   * The constructor of FatGoalCommand object.
   *
   * @param fatGoal     = user's fat consumption goal
   * @param calorieGoal = user's total calorie consumption goal
   */
  public FatGoalCommand(FatGoal fatGoal, CalorieGoal calorieGoal) {
    this.theFatGoal = fatGoal;
    this.theCalorieGoal = calorieGoal;
  }

  /**
   * An override makeDietGoals method implemented from DietGoalCommand.
   */
  @Override
  public void makeDietGoals() {
    this.theFatGoal.setGoal(theCalorieGoal.getTotalCalorieNeed() * 0.2 / 9);
  }
}
