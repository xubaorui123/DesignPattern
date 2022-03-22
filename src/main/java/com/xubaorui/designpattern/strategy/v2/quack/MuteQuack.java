package com.xubaorui.designpattern.strategy.v2.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
