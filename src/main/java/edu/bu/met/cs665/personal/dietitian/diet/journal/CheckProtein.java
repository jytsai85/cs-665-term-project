/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: CheckProtein.java
 * Description: A delegated segment responsible for checking
 * if the total consumed protein has met the protein goal of the user.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

import edu.bu.met.cs665.personal.dietitian.health.goal.ProteinGoal;

/**
 * This is the CheckProtein class.
 * Serves to check if the total consumed protein
 * has met the user's protein goal.
 */
public class CheckProtein implements CheckGoal {
  private final ProteinGoal userProteinGoal;
  private final Protein userProteinConsumption;

  /**
   * The constructor of CheckProtein.
   *
   * @param proteinGoal = user's protein goal
   * @param protein     = consumed protein
   */
  public CheckProtein(ProteinGoal proteinGoal, Protein protein) {
    this.userProteinGoal = proteinGoal;
    this.userProteinConsumption = protein;
  }

  /**
   * An override checkGoal method implemented from CheckGoal class.
   */
  public void checkGoal() {
    double remain = userProteinGoal.getGoal() - userProteinConsumption.getTotalGram();
    if (remain > 0) {
      System.out.println("Total Protein Consumption: "
          + userProteinConsumption.getTotalGram()
          + "g. Still need: " + Math.round(remain * 100.0) / 100.0 + "g.");
    } else {
      System.out.println("You consumed enough protein today!");
    }
  }
}