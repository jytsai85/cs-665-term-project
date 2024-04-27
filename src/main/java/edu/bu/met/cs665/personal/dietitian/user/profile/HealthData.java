/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: HealthData.java
 * Description: The parent code of UserHealthData.
 */

package edu.bu.met.cs665.personal.dietitian.user.profile;

/**
 * This is the HealthData class.
 * It includes the name, age, height, and weight of a user.
 */
public abstract class HealthData {
  String name;
  int age;
  double height;
  double weight;

  /**
   * A getUserProfile method to get the user's name.
   *
   * @return name of the user
   */
  public String getUserProfile() {
    return name;
  }

  /**
   * A getAge method to get the user's age.
   *
   * @return age of the user
   */
  public int getAge() {
    return age;
  }

  /**
   * A getHeight method to get a user's height.
   *
   * @return height of the user
   */
  public double getHeight() {
    return height;
  }

  /**
   * A getWeight method to get a user's weight.
   *
   * @return weight of the user
   */
  public double getWeight() {
    return weight;
  }
}
