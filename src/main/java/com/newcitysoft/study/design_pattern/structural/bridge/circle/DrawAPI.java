package com.newcitysoft.study.design_pattern.structural.bridge.circle;

/**
 * 画图API
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 10:46
 */
public interface DrawAPI {

    /**
     * 画圆形
     * @param radius
     * @param x
     * @param y
     */
    void drawCircle(int radius, int x, int y);
}
