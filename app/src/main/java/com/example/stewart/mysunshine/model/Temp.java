package com.example.stewart.mysunshine.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sstew5 on 1/28/16.
 */
public class Temp {
    private Float day;
    private Float min;
    private Float max;
    private Float night;
    private Float eve;
    private Float morn;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The day
     */
    public Float getDay() {
        return day;
    }

    /**
     *
     * @param day
     * The day
     */
    public void setDay(Float day) {
        this.day = day;
    }

    /**
     *
     * @return
     * The min
     */
    public Float getMin() {
        return min;
    }

    /**
     *
     * @param min
     * The min
     */
    public void setMin(Float min) {
        this.min = min;
    }

    /**
     *
     * @return
     * The max
     */
    public Float getMax() {
        return max;
    }

    /**
     *
     * @param max
     * The max
     */
    public void setMax(Float max) {
        this.max = max;
    }

    /**
     *
     * @return
     * The night
     */
    public Float getNight() {
        return night;
    }

    /**
     *
     * @param night
     * The night
     */
    public void setNight(Float night) {
        this.night = night;
    }

    /**
     *
     * @return
     * The eve
     */
    public Float getEve() {
        return eve;
    }

    /**
     *
     * @param eve
     * The eve
     */
    public void setEve(Float eve) {
        this.eve = eve;
    }

    /**
     *
     * @return
     * The morn
     */
    public Float getMorn() {
        return morn;
    }

    /**
     *
     * @param morn
     * The morn
     */
    public void setMorn(Float morn) {
        this.morn = morn;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
