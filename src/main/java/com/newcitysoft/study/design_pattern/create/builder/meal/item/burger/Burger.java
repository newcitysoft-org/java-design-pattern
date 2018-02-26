package com.newcitysoft.study.design_pattern.create.builder.meal.item.burger;

import com.newcitysoft.study.design_pattern.create.builder.Packing.Packing;
import com.newcitysoft.study.design_pattern.create.builder.Packing.Wrapper;
import com.newcitysoft.study.design_pattern.create.builder.meal.item.Item;

public abstract class Burger implements Item {

   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}