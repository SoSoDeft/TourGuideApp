package com.example.android.tourguideapp;

public class Food {

    private String mRestName;
    private String mAddress;
    private String mCategory;
    private String mWebAddress;
    private int mImage;

    // Default Constructor
    public Food(){

    }

    // Constructor
    public Food(String name, String address, String category, String wAddress, int image ){

        mRestName = name;
        mAddress = address;
        mCategory = category;
        mWebAddress = wAddress;
        mImage = image;
    }


    // Getters

    public String getRestName(){
        return mRestName;
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
