package com.jitianyu.exp1.pojo.decoration;

import com.jitianyu.exp1.pojo.basic.Glyph;
import com.jitianyu.exp1.pojo.basic.Point;
import com.jitianyu.exp1.pojo.basic.Rectangle;
import com.jitianyu.exp1.pojo.window.Window;

/**
 * Border use decorator model to extends the responsibility of glyph. alias
 * wrapper model. a decorator expose the same interface as the real one. it's
 * used to add new responsibilities to a single object, not the whole class
 */
public class BorderDectorator implements Glyph {
    private Glyph glyph;

    /**
     * constructor
     * 
     * @param glyph
     */
    public BorderDectorator(Glyph glyph) {
        this.glyph = glyph;
    }

    @Override
    public void Draw(Window window) {
        this.glyph.Draw(window);
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