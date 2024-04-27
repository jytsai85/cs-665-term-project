/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: ProteinGoalCommand.java
 * Description: A concrete Command class of DietGoalCommand to
 * wrap command to ProteinGoal.
 */

package edu.bu.met.cs665.personal.dietitian.health.goal;

import edu.bu.met.cs665.personal.dietitian.user.profile.HealthData;

/**
 * This is the ProteinGoalCommand class.
 * Serves to wrap commands to ProteinGoal objects.
 */
public class ProteinGoalCommand implements DietGoalCommand {
  private final ProteinGoal theProteinGoal;
  private final HealthData theHealthData;

  /**
   * The constructor of ProteinGoalCommand object.
   *
   * @param proteinGoal = user's protein consumption goal
   * @param healthData  = user's profile
   */
  public ProteinGoalCommand(ProteinGoal proteinGoal, HealthData healthData) {
    this.theProteinGoal = proteinGoal;
    this.theHealthData = healthData;
  }

  /**
   * An override makeDietGoals method implemented from DietGoalCommand.
   */
  @Override
  public void makeDietGoals() {
    this.theProteinGoal.setGoal(theHealthData.getWeight() * 1.2);
  }
}
