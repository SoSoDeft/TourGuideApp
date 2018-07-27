package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class NiteLifeFragment extends Fragment {

    //Default Constructor
    public NiteLifeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_scroll_list, container, false);


        //Create a list of Nite Life Spots
        final ArrayList<Location> locationPlaces = new ArrayList<Location>();

        locationPlaces.add(new Location("The Hummingbird Stage and Taproom", "430 Cherry St.",
                "hummingbirdmacon.com", R.drawable.hummingbird));
        locationPlaces.add(new Location("Grant's Lounge", "576 Poplar St.",
                "grantslounge.com", R.drawable.grants));
        locationPlaces.add(new Location("The Mill Macon", "425 Cherry St.",
                "themillmacon.com", R.drawable.the_mill));


        // Adapter created to populate listView with ArrayList object
        LocationAdapter adapter = new LocationAdapter(getActivity(), locationPlaces);

        ListView listView = (ListView) rootView.findViewById(R.id.list_of_items);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Depending on position of item tap, object saved to field
                Location location = locationPlaces.get(position);

                //Create intent from selected object to send to detail page activity
                Intent i = new Intent(getActivity(), LocationActivity.class);


                i.putExtra("Place Name", location.getLocationName());
                i.putExtra("Place Web", location.getWebAddress());
                i.putExtra("Place Address", location.getAddress());
                i.putExtra("Place Picture", location.getImage());

                startActivity(i);

            }
        });


        return rootView;


    }


}