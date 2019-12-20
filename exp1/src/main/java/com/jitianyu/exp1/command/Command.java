package com.jitianyu.exp1.command;

/**
 * Command
 */
public interface Command {
    /**
     * execute this command
     */
    void execute();

    /**
     * true if this command can be revertted
     * 
     * @return
     */
    Boolean reversible();

    /**
     * revert this command
     */
    void revert();
}