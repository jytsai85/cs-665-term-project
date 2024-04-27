/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: CheckGoal.java
 * Description: The interface of goal-checking tasks delegation.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

/**
 * This is the CheckGoal class.
 * The head of the delegation between all the nutrition goals checking tasks.
 */
public interface CheckGoal {

  /**
   * A checkGoal method to check if the consumed nutrition meets the nutrition goal.
   */
  void checkGoal();
}
