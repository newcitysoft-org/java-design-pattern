package com.newcitysoft.study.design_pattern.structural.bridge.circle;

/**
 * 画绿圆
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 10:48
 */
public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
