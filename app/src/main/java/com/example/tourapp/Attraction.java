package com.example.tourapp;

public class Attraction {
    private String mTitle;
    private String mDescription;
    private String mHours;
    private int mImageResource;

    public Attraction(String mTitle, String mDescription, String mHours, int mImageResource) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mHours = mHours;
        this.mImageResource = mImageResource;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmHours() {
        return mHours;
    }

    public void setmHours(String mHours) {
        this.mHours = mHours;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }
}
