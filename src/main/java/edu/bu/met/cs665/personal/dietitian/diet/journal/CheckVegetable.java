/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: CheckVegetable.java
 * Description: A delegated segment responsible for checking
 * if the total consumed vegetable has met the vegetable goal of the user.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

import edu.bu.met.cs665.personal.dietitian.health.goal.VegetableGoal;

/**
 * This is the CheckVegetable class.
 * Serves to check if the total consumed vegetable
 * has met the user's vegetable goal.
 */
public class CheckVegetable implements CheckGoal {
  private final VegetableGoal userVegetableGoal;
  private final Vegetable userVegetableConsumption;

  /**
   * The constructor of CheckVegetable.
   *
   * @param vegetableGoal = user's vegetable goal
   * @param vegetable     = consumed vegetable
   */
  public CheckVegetable(VegetableGoal vegetableGoal, Vegetable vegetable) {
    this.userVegetableGoal = vegetableGoal;
    this.userVegetableConsumption = vegetable;
  }

  /**
   * An override checkGoal method implemented from CheckGoal class.
   */
  public void checkGoal() {
    double remain = userVegetableGoal.getGoal() - userVegetableConsumption.getTotalGram();
    if (remain > 0) {
      System.out.println("Total Vegetable Consumption: "
          + userVegetableConsumption.getTotalGram()
          + "g. Still need: " + Math.round(remain * 100.0) / 100.0 + "g.");
    } else {
      System.out.println("You consumed enough vegetable today!");
    }
  }
}