package com.example.tourapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestuarantFragment extends Fragment {

    public RestuarantFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewRoot =  inflater.inflate(R.layout.activity_restuarant, container, false);
        final ArrayList<Attraction> restaurantArray = new ArrayList<>();
        restaurantArray.add(new Attraction("Kelseys", "Large portions of American fare & specialty cocktails in a casual setting with comfy booths & TVs. ", "1 noon - 2 noon", R.drawable.grill));
        restaurantArray.add(new Attraction("Fion MacCool's", "Chain of festive Irish pubs featuring traditional comfort food, local & imported brews & live music.", "2 noon - 4 noon", R.drawable.maccool));
        restaurantArray.add(new Attraction("Applebee's Grill + Bar", "Full-service chain bar & grill providing hearty American eats in an informal setting.", "2 noon - 6 noon", R.drawable.applebees));
        restaurantArray.add(new Attraction("Sushi T & T", "Simple spot for Japanese dishes, with all-you-can-eat sushi, plus noodles, tempura & other dishes.", "5 noon - 14 noon", R.drawable.sushi));

        AttractionAdapter myAdapter = new AttractionAdapter(getActivity(), restaurantArray);
        ListView myListView = (ListView) viewRoot.findViewById(R.id.list_restuarants);
        myListView.setAdapter(myAdapter);
        return viewRoot;
    }
}