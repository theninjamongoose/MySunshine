package com.example.stewart.mysunshine.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sstew5 on 1/28/16.
 */
public class List {
    private Integer dt;
    private Temp temp;
    private Float pressure;
    private Integer humidity;
    private java.util.List<Weather> weather = new ArrayList<Weather>();
    private Float speed;
    private Integer deg;
    private Integer clouds;
    private Float rain;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The dt
     */
    public Integer getDt() {
        return dt;
    }

    /**
     *
     * @param dt
     * The dt
     */
    public void setDt(Integer dt) {
        this.dt = dt;
    }

    /**
     *
     * @return
     * The temp
     */
    public Temp getTemp() {
        return temp;
    }

    /**
     *
     * @param temp
     * The temp
     */
    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    /**
     *
     * @return
     * The pressure
     */
    public Float getPressure() {
        return pressure;
    }

    /**
     *
     * @param pressure
     * The pressure
     */
    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    /**
     *
     * @return
     * The humidity
     */
    public Integer getHumidity() {
        return humidity;
    }

    /**
     *
     * @param humidity
     * The humidity
     */
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    /**
     *
     * @return
     * The weather
     */
    public java.util.List<Weather> getWeather() {
        return weather;
    }

    /**
     *
     * @param weather
     * The weather
     */
    public void setWeather(java.util.List<Weather> weather) {
        this.weather = weather;
    }

    /**
     *
     * @return
     * The speed
     */
    public Float getSpeed() {
        return speed;
    }

    /**
     *
     * @param speed
     * The speed
     */
    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    /**
     *
     * @return
     * The deg
     */
    public Integer getDeg() {
        return deg;
    }

    /**
     *
     * @param deg
     * The deg
     */
    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    /**
     *
     * @return
     * The clouds
     */
    public Integer getClouds() {
        return clouds;
    }

    /**
     *
     * @param clouds
     * The clouds
     */
    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    /**
     *
     * @return
     * The rain
     */
    public Float getRain() {
        return rain;
    }

    /**
     *
     * @param rain
     * The rain
     */
    public void setRain(Float rain) {
        this.rain = rain;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
