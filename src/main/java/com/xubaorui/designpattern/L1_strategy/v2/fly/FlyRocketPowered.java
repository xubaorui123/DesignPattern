package com.xubaorui.designpattern.L1_strategy.v2.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我坐火箭上天了");
    }
}
