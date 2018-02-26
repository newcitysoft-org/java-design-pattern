package com.newcitysoft.study.design_pattern.behavioral.command.order;

import com.newcitysoft.study.design_pattern.behavioral.command.entity.Stock;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 12:41
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}