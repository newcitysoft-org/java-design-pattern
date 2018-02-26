package com.newcitysoft.study.design_pattern.structural.bridge.circle;

/**
 * 画绿圈
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 10:55
 */
public class GreyCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: grey, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
