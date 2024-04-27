/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: Fat.java
 * Description: A child class of the Nutrition class which represents Fat.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

import java.util.HashMap;

/**
 * This is the Fat class.
 * Inherits from the Nutrition class.
 */
public class Fat extends Nutrition {

  /**
   * The constructor of Fat.
   */
  public Fat() {
    this.consumption = new HashMap<>();
  }
}
