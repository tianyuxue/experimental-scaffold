package com.jitianyu.exp1.pojo.format;

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
     * formate 
     */
    public void formate() {
        formatStategy.format();
    }
}