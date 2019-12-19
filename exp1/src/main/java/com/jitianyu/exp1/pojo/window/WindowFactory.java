package com.jitianyu.exp1.pojo.window;

import com.jitianyu.exp1.pojo.window.impl.AbstractWindowImplFactory;
import com.jitianyu.exp1.pojo.window.impl.OsxWindowImplFactory;
import com.jitianyu.exp1.pojo.window.impl.WindowImpl;

/**
 * WindowFactory
 */
public class WindowFactory {
    private AbstractWindowImplFactory abstractWindowImplFactory;

    public WindowFactory() {
        // add the chose platform specific code here
        // if on widows
        // else if on osx
        // else linux
        this.abstractWindowImplFactory = new OsxWindowImplFactory();
    }

    /**
     * 
     * @return
     */
    DialogWindow createDialogWindow() {
        WindowImpl windowImpl = this.abstractWindowImplFactory.createMaxButtonWindow();
        return new DialogWindow(windowImpl);
    }

    /**
     * 
     * @return
     */
    IconWindow createIconWindow() {
        return null;
    }
}