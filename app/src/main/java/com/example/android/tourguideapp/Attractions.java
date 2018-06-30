package com.example.android.tourguideapp;


import org.parceler.Parcel;

@Parcel
public class Attractions {

    String mAttractionName;
    String mAddress;
    String mCategory;
    String mWebAddress;
    int mImage;

    // Default Constructor
    public Attractions(){

    }

    // Constructor
    public Attractions(String name, String address, String category, String wAddress, int image ){

        mAttractionName = name;
        mAddress = address;
        mCategory = category;
        mWebAddress = wAddress;
        mImage = image;
    }


    // Getters

    public String getAttractionName(){
        return mAttractionName;
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
