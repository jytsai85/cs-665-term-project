/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: Protein.java
 * Description: A child class of the Nutrition class which represents Protein.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

import java.util.HashMap;

/**
 * This is the Protein class.
 * Inherits from the Nutrition class.
 */
public class Protein extends Nutrition {

  /**
   * The constructor of Protein.
   */
  public Protein() {
    this.consumption = new HashMap<>();
  }
}
