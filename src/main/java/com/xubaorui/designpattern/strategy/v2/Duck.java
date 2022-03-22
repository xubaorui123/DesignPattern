package com.xubaorui.designpattern.strategy.v2;

import com.xubaorui.designpattern.strategy.v2.fly.FlyBehavior;
import com.xubaorui.designpattern.strategy.v2.quack.QuackBehavior;

/**
 * 将鸭子的行为抽取出来
 */
public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("我会游泳");
    }

    /**
     * 显示方法 由子类实现
     */
    public abstract void display();


    /**
     * 新添加飞行的方法
     */
    public void performFly() {
        flyBehavior.fly();
    }
}
