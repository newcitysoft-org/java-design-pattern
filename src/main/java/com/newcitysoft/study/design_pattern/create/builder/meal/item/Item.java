package com.newcitysoft.study.design_pattern.create.builder.meal.item;

import com.newcitysoft.study.design_pattern.create.builder.Packing.Packing;

public interface Item {
   public String name();
   public Packing packing();
   public float price();    
}