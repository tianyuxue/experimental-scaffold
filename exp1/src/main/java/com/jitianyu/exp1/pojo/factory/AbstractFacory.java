package com.jitianyu.exp1.pojo.factory;

import com.jitianyu.exp1.pojo.basic.Glyph;

/**
 * AbstractFacory abstracts the creation of objects. It fits for create
 * different series products and these products is always the same.
 */
public interface AbstractFacory {
    /**
     * 
     * @return row item
     */
    Glyph createRow();

    /**
     * 
     * @return border item
     */
    Glyph createBorder();

    /**
     * 
     * @return
     */
    Glyph createScrollBar();

}