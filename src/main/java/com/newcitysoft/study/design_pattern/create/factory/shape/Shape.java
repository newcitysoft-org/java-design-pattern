package com.newcitysoft.study.design_pattern.create.factory.shape;
/**
 * 我们将创建一个 Shape 接口和实现 Shape 接口的实体类。
 * 下一步是定义工厂类 ShapeFactory。
 * FactoryPatternDemo，我们的演示类使用 ShapeFactory 来获取 Shape 对象。
 * 它将向 ShapeFactory 传递信息（CIRCLE / RECTANGLE / SQUARE），以便获取它所需对象的类型。
 * @author lixin.tian@renren-inc.com
 * @date 2018-02-05
 *
 */
public interface Shape {
	void draw();
}
