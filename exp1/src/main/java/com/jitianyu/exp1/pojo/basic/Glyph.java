package com.jitianyu.exp1.pojo.basic;

import com.jitianyu.exp1.pojo.window.Window;

/**
 * @author jitianyu
 * @date 2019-12-19
 */
public interface Glyph {
    /**
     * responsebility: apprearance
     * 
     * @return json formatted picture info
     */
    void Draw(Window window);

    /**
     * responsebility: apprearance
     * 
     * @param rectangle rectangle
     */
    void Bounds(Rectangle rectangle);

    /**
     * responsebility: hit ditection
     * 
     * @param point
     * @return
     */
    Boolean intersects(Point point);

    /**
     * responsebility: structure
     * 
     * @param child child
     */
    void insertChild(Glyph child);

    /**
     * responsebility: structure
     * 
     * @param child child
     */
    void removeChild(Glyph child);

    /**
     * responsebility: structure
     * 
     * @param index index
     * @return
     */
    Glyph getChild(Integer index);

    /**
     * responsebility: structure
     * 
     * @return
     */
    Glyph getParent();
}