package com.xubaorui.designpattern.strategy.v0;

public abstract class Duck {
    public void quack(){
        System.out.println("呱呱叫");
    }
    public void swim(){
        System.out.println("我会游泳");
    }

    /**
     * 显示方法 由子类实现
     */
    public abstract void display();
}
