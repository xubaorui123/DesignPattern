package com.xubaorui.designpattern.strategy.v2;

import com.xubaorui.designpattern.strategy.v2.fly.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();
        mallarDuck.performQuack();
        mallarDuck.performFly();
        mallarDuck.swim();
        mallarDuck.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.swim();
        modelDuck.display();

        modelDuck.setFlyBehavior(new FlyRocketPowered());

        modelDuck.performFly();
    }
}
