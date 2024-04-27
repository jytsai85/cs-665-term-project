/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: Carbohydrate.java
 * Description: A child class of the Nutrition class which represents Carbohydrate.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

import java.util.HashMap;

/**
 * This is the Carbohydrate class.
 * Inherits from the Nutrition class.
 */
public class Carbohydrate extends Nutrition {

  /**
   * The constructor of Carbohydrate.
   */
  public Carbohydrate() {
    this.consumption = new HashMap<>();
  }
}
