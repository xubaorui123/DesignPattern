package com.xubaorui.designpattern.strategy.v2;


import com.xubaorui.designpattern.strategy.v2.fly.FlyWithWings;
import com.xubaorui.designpattern.strategy.v2.quack.Quack;

public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我有一颗绿色的头");
    }
}
