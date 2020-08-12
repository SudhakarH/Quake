package com.example.quake;

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMilliseconds;
    private String mUrl;


    public Earthquake(String magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public String getMagnitude() {
        return mMagnitude;
    }
    public String getLocation() {
        return mLocation;
    }
    public String getDate() {
        return mDate;
    }
    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl() {
        return mUrl;
    }
}
