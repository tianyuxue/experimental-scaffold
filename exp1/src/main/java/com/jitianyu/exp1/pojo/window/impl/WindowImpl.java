package com.jitianyu.exp1.pojo.window.impl;

/**
 * bridge model: seperate the logical abstraction and its implementation, so
 * they can both evolve at the same time. tips: try to abstract what is
 * variable. as Rumbaugh said, this model suits for nested generalizations.
 */
public interface WindowImpl {
    void deviceRaise();

    void deviceRect();
}