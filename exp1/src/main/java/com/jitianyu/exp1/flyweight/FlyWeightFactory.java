package com.jitianyu.exp1.flyweight;

/**
 * FlyWeightFactory
 * example in real world: Integer.valuesOf() does not create new object,
 * but reuses the existed one.
 */
public class FlyWeightFactory {
    /**
     * get resued flyweight object
     * create a new one if not existed then add it into the pool
     * @param key key
     * @return
     */
    FlyWeight getFlyWeight(String key) {
        return null;
    }
}


