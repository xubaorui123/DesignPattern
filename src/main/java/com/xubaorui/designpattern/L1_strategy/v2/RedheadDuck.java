package com.xubaorui.designpattern.L1_strategy.v2;


import com.xubaorui.designpattern.L1_strategy.v2.fly.FlyWithWings;
import com.xubaorui.designpattern.L1_strategy.v2.quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我有一颗红色的头");
    }
}
