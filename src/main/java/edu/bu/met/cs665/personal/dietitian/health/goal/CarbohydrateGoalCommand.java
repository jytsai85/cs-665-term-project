/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: CarbohydrateGoalCommand.java
 * Description: A concrete Command class of DietGoalCommand to
 * wrap command to CarbohydrateGoal.
 */

package edu.bu.met.cs665.personal.dietitian.health.goal;

/**
 * This is the CarbohydrateGoalCommand class.
 * Serves to wrap commands to CarbohydrateGoal objects.
 */
public class CarbohydrateGoalCommand implements DietGoalCommand {
  private final CarbohydrateGoal theCarbohydrateGoal;
  private final ProteinGoal theProteinGoal;
  private final FatGoal theFatGoal;
  private final CalorieGoal theCalorieGoal;

  /**
   * The constructor of CarbohydrateGoalCommand object.
   *
   * @param carbohydrateGoal = user's carbohydrate consumption goal
   * @param proteinGoal      = user's protein consumption goal
   * @param fatGoal          = user's fat consumption goal
   * @param calorieGoal      = user's total calorie consumption goal
   */
  public CarbohydrateGoalCommand(final CarbohydrateGoal carbohydrateGoal,
                                 final ProteinGoal proteinGoal,
                                 final FatGoal fatGoal,
                                 final CalorieGoal calorieGoal) {
    this.theCarbohydrateGoal = carbohydrateGoal;
    this.theProteinGoal = proteinGoal;
    this.theFatGoal = fatGoal;
    this.theCalorieGoal = calorieGoal;
  }

  /**
   * An override makeDietGoals method implemented from DietGoalCommand.
   */
  @Override
  public void makeDietGoals() {
    this.theCarbohydrateGoal.setGoal(((theCalorieGoal.getTotalCalorieNeed() - 200)
        - (theProteinGoal.getGoal() * 4) - (theFatGoal.getGoal() * 9)) / 4);
  }
}
