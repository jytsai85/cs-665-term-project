/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: UserBMR.java
 * Description: The concrete Decorator code to add methods to HealthData.
 */

package edu.bu.met.cs665.personal.dietitian.user.profile;

/**
 * This is the UserBMR class.
 * Inherit from HealthDataDecorator as the concrete Decorator.
 */
public class UserBMR extends HealthDataDecorator {
  HealthData theHealthData;

  /**
   * A UserBMR (Decorator) constructor.
   *
   * @param healthData = the user's profile
   */
  public UserBMR(HealthData healthData) {
    this.theHealthData = healthData;
  }

  /**
   * An override getUserProfile method extended from HealthData.
   *
   * @return sum of the user profile
   */
  @Override
  public String getUserProfile() {
    return "Name: " + theHealthData.getUserProfile()
        + "\nAge: " + theHealthData.getAge()
        + "\nHeight: " + theHealthData.getHeight()
        + "\nWeight: " + theHealthData.getWeight()
        + "\nBMR: " + getBMR();
  }

  /**
   * A getBMR method that calculate the BMR of the user.
   *
   * @return user's BMR
   */
  public double getBMR() {
    double bmrCalculator = 447.593
        + (9.247 * theHealthData.getWeight())
        + (3.098 * theHealthData.getHeight())
        - (4.330 * theHealthData.getAge());
    return Math.round(bmrCalculator * 100.0) / 100.0;
  }
}
