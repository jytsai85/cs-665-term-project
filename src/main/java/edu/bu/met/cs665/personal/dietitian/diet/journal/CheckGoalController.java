/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/24/2024
 * File Name: CheckGoalController.java
 * Description: The helper object of goal-checking tasks delegation.
 */

package edu.bu.met.cs665.personal.dietitian.diet.journal;

import edu.bu.met.cs665.personal.dietitian.health.goal.*;

/**
 * This is the CheckGoalController class.
 * The helper object of the delegation between all the nutrition goals checking tasks.
 */
public class CheckGoalController implements CheckGoal {
  ProteinGoal userProteinGoal;
  FatGoal userFatGoal;
  CarbohydrateGoal userCarbohydrateGoal;
  VegetableGoal userVegetableGoal;
  CalorieGoal userCalorieGoal;
  Protein userProteinConsumption;
  Fat userFatConsumption;
  Carbohydrate userCarbohydrateConsumption;
  Vegetable userVegetableConsumption;
  Calorie userCalorieConsumption;

  /**
   * The constructor of the CheckGoalController.
   *
   * @param proteinGoal      = user's protein consumption goal
   * @param fatGoal          = user's fat consumption goal
   * @param carbohydrateGoal = user's carbohydrate consumption goal
   * @param vegetableGoal    = user's vegetable consumption goal
   * @param calorieGoal      = user's daily calorie consumption recommendation
   * @param protein          = user's protein consumption
   * @param fat              = user's fat consumption
   * @param carbohydrate     = user's carbohydrate consumption
   * @param vegetable        = user's vegetable consumption
   * @param calorie          = user's calorie consumption
   */
  public CheckGoalController(ProteinGoal proteinGoal,
                             FatGoal fatGoal,
                             CarbohydrateGoal carbohydrateGoal,
                             VegetableGoal vegetableGoal,
                             CalorieGoal calorieGoal,
                             Protein protein,
                             Fat fat,
                             Carbohydrate carbohydrate,
                             Vegetable vegetable,
                             Calorie calorie) {
    this.userProteinGoal = proteinGoal;
    this.userFatGoal = fatGoal;
    this.userCarbohydrateGoal = carbohydrateGoal;
    this.userVegetableGoal = vegetableGoal;
    this.userCalorieGoal = calorieGoal;
    this.userProteinConsumption = protein;
    this.userFatConsumption = fat;
    this.userCarbohydrateConsumption = carbohydrate;
    this.userVegetableConsumption = vegetable;
    this.userCalorieConsumption = calorie;
  }

  /**
   * An checkGoal method that checks all the nutrition goal.
   */
  public void checkGoal() {
    CheckProtein checkUserProtein = new CheckProtein(userProteinGoal, userProteinConsumption);
    CheckFat checkUserFat = new CheckFat(userFatGoal, userFatConsumption);
    CheckCarbohydrate checkUserCarbohydrate = new CheckCarbohydrate(
        userCarbohydrateGoal, userCarbohydrateConsumption);
    CheckVegetable checkUserVegetable = new CheckVegetable(
        userVegetableGoal, userVegetableConsumption);
    CheckCalorie checkUserCalorie = new CheckCalorie(userCalorieGoal, userCalorieConsumption);

    checkUserProtein.checkGoal();
    checkUserFat.checkGoal();
    checkUserCarbohydrate.checkGoal();
    checkUserVegetable.checkGoal();
    checkUserCalorie.checkGoal();
  }
}
