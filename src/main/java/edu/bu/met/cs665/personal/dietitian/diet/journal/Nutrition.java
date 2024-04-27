/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: Nutrition.java
 * Description: The parent template of all the nutrition classes.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the Nutrition class.
 * Includes template attributes and methods for other nutrition classes.
 */
public abstract class Nutrition {

  HashMap<String, Double> consumption;

  /**
   * An eatFood method to add consumed nutrition item and its portion
   * as a key-value pair to the HashMap.
   */
  public void eatFood(String item, Double gram) {
    consumption.put(item, gram);
  }

  /**
   * A getTotalGram method to sum the total weight of consumed nutrition.
   *
   * @return a double of sum of consumed nutrition
   */
  public double getTotalGram() {
    double sum = 0.0;
    for (Map.Entry<String, Double> entry : consumption.entrySet()) {
      sum += entry.getValue();
    }
    return sum;
  }

  /**
   * A getDescription method to display all the consumed nutrition items.
   */
  public void getDescription() {
    for (Map.Entry<String, Double> entry : consumption.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
