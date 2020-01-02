package com.jitianyu.exp1.flyweight;

/**
 * FlyWeight
 */
public interface FlyWeight {

    /**
     * do something base on the external state.
     * @param externalState
     */
    void doSomething(Object externalState);
}