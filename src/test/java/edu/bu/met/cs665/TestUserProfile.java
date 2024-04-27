/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: TestUserProfile.java
 * Description: A class to perform JUnit Tests on creating User Profile.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.personal.dietitian.user.profile.HealthData;
import edu.bu.met.cs665.personal.dietitian.user.profile.UserHealthData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This is the TestUserProfile class.
 * Test codes to create User Profile are functioning properly.
 */
public class TestUserProfile {
  HealthData Joan = new UserHealthData("Joan", 64, 158.3, 66.2);

  public TestUserProfile() {
  }

  /**
   * A JUnit Test to get the user's name.
   */
  @Test
  public void testUserName() {
    assertEquals("Joan", Joan.getUserProfile());
  }

  /**
   * A JUnit Test to get the user's age.
   */
  @Test
  public void testUserAge() {
    assertEquals(64, Joan.getAge());
  }
}
