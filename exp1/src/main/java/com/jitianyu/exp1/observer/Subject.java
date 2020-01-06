package com.jitianyu.exp1.observer;

/**
 * Subject
 */
public interface Subject {

    /**
     * attach an observer to this subject
     * @param observer
     */
    void attach(Observer observer);

    /**
     * detach an observer to this subject
     * @param observer
     */
    void detach(Observer observer);

    /**
     * send signal to all observer
     * eg: for o in all observers:
     *        call o.Update()j
     */
    void notifyObservers();
}