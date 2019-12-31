package com.jitianyu.exp1.pojo.format;

import com.jitianyu.exp1.pojo.basic.Glyph;

/**
 * Formatter use stargegy pattern, alias policy pattern
 */
public interface FormatStategy {
    /**
     * format a glyph 
     * @param glyph
     */
    public void format(Glyph glyph);
}