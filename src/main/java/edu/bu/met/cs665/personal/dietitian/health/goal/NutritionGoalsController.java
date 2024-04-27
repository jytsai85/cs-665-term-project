/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: NutritionGoalsController.java
 * Description: The controller class of multiple nutrition Commands.
 */

package edu.bu.met.cs665.personal.dietitian.health.goal;

import edu.bu.met.cs665.personal.dietitian.user.profile.HealthData;

/**
 * This is the NutritionGoalsController class.
 * It wraps multiple nutrition goals with commands and
 * calculate the nutrition needs.
 */
public class NutritionGoalsController extends NutritionGoal {
  HealthData theHealthData;
  ProteinGoal theProteinGoal;
  FatGoal theFatGoal;
  CarbohydrateGoal theCarbohydrateGoal;
  VegetableGoal theVegetableGoal;

  /**
   * The constructor of NutritionGoalsController.
   *
   * @param healthData = the user's profile
   */
  public NutritionGoalsController(HealthData healthData) {
    this.theHealthData = healthData;
    this.theProteinGoal = new ProteinGoal();
    this.theFatGoal = new FatGoal();
    this.theCarbohydrateGoal = new CarbohydrateGoal();
    this.theVegetableGoal = new VegetableGoal();
  }

  /**
   * A getNutritionGoals method to wrap nutrition goals with command and
   * calculate the nutrition needs.
   */
  public void getNutritionGoals(CalorieGoal userCalorieGoal) {

    // Wrap the nutrition goals with command
    ProteinGoalCommand userProteinGoal = new ProteinGoalCommand(theProteinGoal, theHealthData);
    FatGoalCommand userFatGoal = new FatGoalCommand(theFatGoal, userCalorieGoal);
    CarbohydrateGoalCommand userCarbohydrateGoal = new CarbohydrateGoalCommand(
        theCarbohydrateGoal,
        theProteinGoal,
        theFatGoal,
        userCalorieGoal);

    // calculate the nutrition goals
    userProteinGoal.makeDietGoals();
    userFatGoal.makeDietGoals();
    userCarbohydrateGoal.makeDietGoals();
  }

  /**
   * A getProteinGoal method to extract only the Protein goal.
   *
   * @return user's protein consumption goal
   */
  public ProteinGoal getProteinGoal() {
    return theProteinGoal;
  }

  /**
   * A getFatGoal method to extract only the Fat goal.
   *
   * @return user's fat consumption goal
   */
  public FatGoal getFatGoal() {
    return theFatGoal;
  }

  /**
   * A getCarbohydrateGoal method to extract only the Carbohydrate goal.
   *
   * @return user's carbohydrate consumption goal
   */
  public CarbohydrateGoal getCarbohydrateGoal() {
    return theCarbohydrateGoal;
  }

  /**
   * A getDescription method to display a summary of
   * the user's nutrition goals.
   */
  public void getDescription() {
    System.out.println(theHealthData.getUserProfile()
        + ", Here's your daily nutrition need\nPROTEIN: "
        + Math.round(theProteinGoal.getGoal() * 100.0) / 100.0 + "g."
        + "\nFAT: " + Math.round(theFatGoal.getGoal() * 100.0) / 100.0 + "g."
        + "\nCARBOHYDRATE: " + Math.round(theCarbohydrateGoal.getGoal() * 100.0) / 100.0 + "g."
        + "\nVEGETABLE: " + Math.round(theVegetableGoal.getGoal() * 100.0) / 100.0 + "g.");
  }
}
