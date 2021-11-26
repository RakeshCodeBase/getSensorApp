package com.collection.getsensordata;

public class AQIDataStorageClass {
    int aqi;
    Long time_stamp;
    float latitude, longitude;

    public AQIDataStorageClass() {
    }

    public AQIDataStorageClass(int aqi, Long time_stamp, float latitude, float longitude) {
        this.aqi = aqi;
        this.time_stamp = time_stamp;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public Long getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(Long time_stamp) {
        this.time_stamp = time_stamp;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
