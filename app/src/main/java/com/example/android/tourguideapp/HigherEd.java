package com.example.android.tourguideapp;

public class HigherEd {

    private String mSchoolName;
    private String mAddress;
    private String mCategory;
    private String mWebAddress;
    private int mImage;

    // Default Constructor
    public HigherEd(){

    }

    // Constructor
    public HigherEd(String name, String address, String category, String wAddress, int image ){

        mSchoolName = name;
        mAddress = address;
        mCategory = category;
        mWebAddress = wAddress;
        mImage = image;
    }


    // Getters

    public String getSchoolName(){
        return mSchoolName;
    }

    public String getAddress(){
        return mAddress;
    }

    public String getCategory(){
        return mCategory;
    }

    public String getWebAddress(){
        return mWebAddress;
    }

    public int getImage(){
        return mImage;
    }
}
