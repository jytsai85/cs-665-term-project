/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: Calorie.java
 * Description: A class calculate total calorie consumption from eaten nutrition items.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

/**
 * This is the Calorie class.
 * Calculates total calorie consumption based on
 * consumed nutrition items from all the nutrition classes.
 */
public class Calorie {
  private final Protein theProtein;
  private final Fat theFat;
  private final Carbohydrate theCarbohydrate;
  private final Vegetable theVegetable;

  /**
   * The constructor of Calorie.
   *
   * @param protein      = consumed protein
   * @param fat          = consumed fat
   * @param carbohydrate = consumed carbohydrate
   * @param vegetable    = consumed vegetable
   */
  public Calorie(Protein protein, Fat fat, Carbohydrate carbohydrate, Vegetable vegetable) {
    this.theProtein = protein;
    this.theFat = fat;
    this.theCarbohydrate = carbohydrate;
    this.theVegetable = vegetable;
  }

  /**
   * A calorieConsumption method that calculates total calorie consumption.
   * @return calorie sum of consumed protein, fat, carbohydrate, and vegetable
   */
  public double calorieConsumption() {
    return theProtein.getTotalGram() * 4
        + theFat.getTotalGram() * 9
        + theCarbohydrate.getTotalGram() * 4
        + theVegetable.getTotalGram();
  }
}
