package com.xubaorui.designpattern.strategy.v2.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我用翅膀飞");
    }
}
