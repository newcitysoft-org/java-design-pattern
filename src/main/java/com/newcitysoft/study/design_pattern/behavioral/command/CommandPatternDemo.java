package com.newcitysoft.study.design_pattern.behavioral.command;

import com.newcitysoft.study.design_pattern.behavioral.command.entity.Stock;
import com.newcitysoft.study.design_pattern.behavioral.command.order.BuyStock;
import com.newcitysoft.study.design_pattern.behavioral.command.order.SellStock;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/24 12:43
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
