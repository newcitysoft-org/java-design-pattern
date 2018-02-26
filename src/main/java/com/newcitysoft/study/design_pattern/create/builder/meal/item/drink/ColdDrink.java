package com.newcitysoft.study.design_pattern.create.builder.meal.item.drink;

import com.newcitysoft.study.design_pattern.create.builder.Packing.Bottle;
import com.newcitysoft.study.design_pattern.create.builder.Packing.Packing;
import com.newcitysoft.study.design_pattern.create.builder.meal.item.Item;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
       return new Bottle();
    }

    @Override
    public abstract float price();
}