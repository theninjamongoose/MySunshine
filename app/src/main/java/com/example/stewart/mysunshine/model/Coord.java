package com.example.stewart.mysunshine.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sstew5 on 1/28/16.
 */
public class Coord {
    private Float lon;
    private Float lat;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The lon
     */
    public Float getLon() {
        return lon;
    }

    /**
     *
     * @param lon
     * The lon
     */
    public void setLon(Float lon) {
        this.lon = lon;
    }

    /**
     *
     * @return
     * The lat
     */
    public Float getLat() {
        return lat;
    }

    /**
     *
     * @param lat
     * The lat
     */
    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
