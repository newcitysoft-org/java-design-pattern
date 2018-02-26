package com.newcitysoft.study.design_pattern.create.builder.meal;

import com.newcitysoft.study.design_pattern.create.builder.meal.item.burger.ChickenBurger;
import com.newcitysoft.study.design_pattern.create.builder.meal.item.burger.VegBurger;
import com.newcitysoft.study.design_pattern.create.builder.meal.item.drink.Coke;
import com.newcitysoft.study.design_pattern.create.builder.meal.item.drink.Pepsi;

public class MealBuilder {
   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }


   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}