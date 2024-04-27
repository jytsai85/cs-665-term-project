/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: CheckFat.java
 * Description: A delegated segment responsible for checking
 * if the total consumed fat has met the fat goal of the user.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

import edu.bu.met.cs665.personal.dietitian.health.goal.FatGoal;

/**
 * This is the CheckFat class.
 * Serves to check if the total consumed fat
 * has met the user's fat goal.
 */
public class CheckFat implements CheckGoal {
  private final FatGoal userFatGoal;
  private final Fat userFatConsumption;

  /**
   * The constructor of CheckFat.
   *
   * @param fatGoal = user's fat goal
   * @param fat     = consumed fat
   */
  public CheckFat(FatGoal fatGoal, Fat fat) {
    this.userFatGoal = fatGoal;
    this.userFatConsumption = fat;
  }

  /**
   * An override checkGoal method implemented from CheckGoal class.
   */
  public void checkGoal() {
    double remain = userFatGoal.getGoal() - userFatConsumption.getTotalGram();
    if (remain > 0) {
      System.out.println("Total Fat Consumption: "
          + userFatConsumption.getTotalGram()
          + "g. Still need: " + Math.round(remain * 100.0) / 100.0 + "g.");
    } else {
      System.out.println("You consumed enough fat today!");
    }
  }
}