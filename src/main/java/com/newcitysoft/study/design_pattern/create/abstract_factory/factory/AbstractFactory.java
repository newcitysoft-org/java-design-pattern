package com.newcitysoft.study.design_pattern.create.abstract_factory.factory;

import com.newcitysoft.study.design_pattern.create.abstract_factory.color.Color;
import com.newcitysoft.study.design_pattern.create.abstract_factory.shape.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape) ;
}