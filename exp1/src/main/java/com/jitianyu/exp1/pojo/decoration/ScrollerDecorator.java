
package com.jitianyu.exp1.pojo.decoration;

import com.jitianyu.exp1.pojo.basic.Glyph;
import com.jitianyu.exp1.pojo.basic.Point;
import com.jitianyu.exp1.pojo.basic.Rectangle;

/**
 * Scroller
 */
public class ScrollerDecorator implements Glyph {
    private Glyph glyph;

    @Override
    public String Draw() {
        return this.glyph.Draw();
    }

    @Override
    public void Bounds(Rectangle rectangle) {
        this.glyph.Bounds(rectangle);
    }

    @Override
    public Boolean intersects(Point point) {
        return this.glyph.intersects(point);
    }

    @Override
    public void insertChild(Glyph child) {
        this.glyph.insertChild(child);
    }

    @Override
    public void removeChild(Glyph child) {
        this.glyph.removeChild(child);
    }

    @Override
    public Glyph getChild(Integer index) {
        return this.glyph.getChild(index);
    }

    @Override
    public Glyph getParent() {
        return this.glyph.getParent();
    }
}