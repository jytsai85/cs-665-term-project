/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: DietGoalCommand.java
 * Description: The interface of a Command class.
 */

package edu.bu.met.cs665.personal.dietitian.health.goal;

/**
 * This is the DietGoalCommand class.
 * Serves as the interface of concrete Command classes.
 */
public interface DietGoalCommand {

  /**
   * A makeDietGoals method to calculate nutrition need.
   */
  void makeDietGoals();
}
