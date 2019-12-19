package com.jitianyu.exp1.pojo.format;

import com.jitianyu.exp1.pojo.basic.Glyph;

/**
 * Formatter
 */
public class Formatter {
    private FormatStategy formatStategy;

    /**
     * @param formatStategy the formatStategy to set
     */
    public void setFormatStategy(FormatStategy formatStategy) {
        this.formatStategy = formatStategy;
    }

    /**
     * the parameter seems to be some glyph, the glyph can be treated as the context
     * holds everything that a formatter needs
     */
    public void formate(Glyph glyph) {
        formatStategy.format(glyph);
    }
}