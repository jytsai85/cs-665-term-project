/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: TestCheckGoal.java
 * Description: A class to perform JUnit Tests on checking user's nutrition goal.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.personal.dietitian.diet.journal.*;
import edu.bu.met.cs665.personal.dietitian.health.goal.CalorieGoal;
import edu.bu.met.cs665.personal.dietitian.health.goal.CalorieGoalCommand;
import edu.bu.met.cs665.personal.dietitian.health.goal.DietGoalCommand;
import edu.bu.met.cs665.personal.dietitian.user.profile.HealthData;
import edu.bu.met.cs665.personal.dietitian.user.profile.UserBMR;
import edu.bu.met.cs665.personal.dietitian.user.profile.UserHealthData;
import org.junit.Test;

public class TestCheckGoal {
  HealthData Joan = new UserHealthData("Joan", 64, 158.3, 66.2);
  UserBMR joanBMR = new UserBMR(Joan);

  public TestCheckGoal() {
  }

  @Test
  public void testCalorieOverConsume() {
    final CalorieGoal userCalorieGoal = new CalorieGoal();
    final DietGoalCommand calorieGoal = new CalorieGoalCommand(userCalorieGoal, joanBMR);
    calorieGoal.makeDietGoals();
    Carbohydrate breakfastCarbohydrate = new Carbohydrate();
    Protein breakfastProtein = new Protein();
    Fat breakfastFat = new Fat();
    Vegetable breakfastVegetable = new Vegetable();
    breakfastCarbohydrate.eatFood("McDonald", 2000.0);
    Calorie breakfastCalorie = new Calorie(
        breakfastProtein,
        breakfastFat,
        breakfastCarbohydrate,
        breakfastVegetable);
    CheckCalorie checkUserCalorie = new CheckCalorie(userCalorieGoal, breakfastCalorie);
    checkUserCalorie.checkGoal();
  }
}
