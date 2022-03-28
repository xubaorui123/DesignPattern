package com.xubaorui.designpattern.L1_strategy.v2;

import com.xubaorui.designpattern.L1_strategy.v2.fly.FlyNoWay;
import com.xubaorui.designpattern.L1_strategy.v2.quack.MuteQuack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }
}
