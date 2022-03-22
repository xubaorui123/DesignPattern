package com.xubaorui.designpattern.strategy.v2.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
