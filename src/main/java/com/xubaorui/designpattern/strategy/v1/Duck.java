package com.xubaorui.designpattern.strategy.v1;

/**
 * 新需求，需要让鸭子能飞
 */
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


    /**
     * 新添加飞行的方法
     */
     public void fly(){
         System.out.println("我可以飞了");
     }
}
