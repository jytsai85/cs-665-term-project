/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: UserHealthData.java
 * Description: A class responsible for each user's profile.
 */

package edu.bu.met.cs665.personal.dietitian.user.profile;

/**
 * This is the UserHealthData class.
 * Inherits from HealthData.
 */
public class UserHealthData extends HealthData {

  /**
   * The constructor of a user profile.
   *
   * @param username    = name of the user
   * @param inputAge    = age of the user
   * @param inputHeight = height of the user
   * @param inputWeight = weight of the user
   */
  public UserHealthData(String username, int inputAge, double inputHeight, double inputWeight) {
    name = username;
    age = inputAge;
    height = inputHeight;
    weight = inputWeight;
  }
}
