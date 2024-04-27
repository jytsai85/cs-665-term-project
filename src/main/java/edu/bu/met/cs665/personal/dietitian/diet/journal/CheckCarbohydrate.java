/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: CheckCarbohydrate.java
 * Description: A delegated segment responsible for checking
 * if the total consumed carbohydrate has met the carbohydrate goal of the user.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

import edu.bu.met.cs665.personal.dietitian.health.goal.CarbohydrateGoal;

/**
 * This is the CheckCarbohydrate class.
 * Serves to check if the total consumed carbohydrate
 * has met the user's carbohydrate goal.
 */
public class CheckCarbohydrate implements CheckGoal {
  private final CarbohydrateGoal userCarbohydrateGoal;
  private final Carbohydrate userCarbohydrateConsumption;

  /**
   * The constructor of CheckCarbohydrate.
   *
   * @param carbohydrateGoal = user's carbohydrate goal
   * @param carbohydrate     = consumed carbohydrate
   */
  public CheckCarbohydrate(CarbohydrateGoal carbohydrateGoal, Carbohydrate carbohydrate) {
    this.userCarbohydrateGoal = carbohydrateGoal;
    this.userCarbohydrateConsumption = carbohydrate;
  }

  /**
   * An override checkGoal method implemented from CheckGoal class.
   */
  public void checkGoal() {
    double remain = userCarbohydrateGoal.getGoal() - userCarbohydrateConsumption.getTotalGram();
    if (remain > 0) {
      System.out.println("Total Carbohydrate Consumption: "
          + userCarbohydrateConsumption.getTotalGram()
          + "g. Still need: " + Math.round(remain * 100.0) / 100.0 + "g.");
    } else {
      System.out.println("You consumed enough Carbohydrate today!");
    }
  }
}
