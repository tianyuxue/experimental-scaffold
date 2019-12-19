package com.jitianyu.exp1.pojo.window;

import com.jitianyu.exp1.pojo.window.impl.WindowImpl;

/**
 * DialogWindow
 */
public class DialogWindow implements Window {
    private final WindowImpl windowImpl;

    public DialogWindow(WindowImpl windowImpl) {
        this.windowImpl = windowImpl;
    }

    @Override
    public void reDraw() {
        // TODO Auto-generated method stub

    }

    @Override
    public void raise() {
        // TODO Auto-generated method stub

    }

    @Override
    public void drawLine() {
        // TODO Auto-generated method stub

    }

    @Override
    public void drawText() {
        // TODO Auto-generated method stub

    }

    @Override
    public void drawRect() {
        // TODO Auto-generated method stub

    }

}