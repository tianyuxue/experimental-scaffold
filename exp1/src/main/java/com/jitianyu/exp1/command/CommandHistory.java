package com.jitianyu.exp1.command;

import java.util.ArrayList;
import java.util.List;

/**
 * CommandHistory
 */
public class CommandHistory {
    /**
     * use thread safe queue
     */
    private final List<Command> historicalCommand = new ArrayList<>();
    private int currentCommandPos = 0;

    public void add(Command command) {

    }

    public void undo() {
        historicalCommand.get(currentCommandPos).revert();
        currentCommandPos--;
    }

    public void redo() {
        historicalCommand.get(currentCommandPos).execute();
        currentCommandPos++;
    }
}