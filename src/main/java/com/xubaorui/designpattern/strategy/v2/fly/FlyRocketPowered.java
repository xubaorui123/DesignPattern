package com.xubaorui.designpattern.strategy.v2.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我坐火箭上天了");
    }
}
