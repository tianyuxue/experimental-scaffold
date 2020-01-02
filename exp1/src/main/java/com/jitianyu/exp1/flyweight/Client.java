package com.jitianyu.exp1.flyweight;

/**
 * the user of FlayWeight
 * Client
 */
public class Client {
    FlyWeightFactory flyWeightFactory = new FlyWeightFactory();

    void needFlyWeight() {
        FlyWeight flyWeight = flyWeightFactory.getFlyWeight("key");
        flyWeight.doSomething(null);
    }
}