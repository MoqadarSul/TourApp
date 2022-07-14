package com.example.tourapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.activity_hotel, container, false);
        final ArrayList<Attraction> hotelArray = new ArrayList<>();
        hotelArray.add(new Attraction("Hilton Garden Inn Toronto/Ajax", "Located Off Highway 401 in Ajax, Ontario", "24 hours", R.drawable.hilton));
        hotelArray.add(new Attraction("Radisson Blu DownTown", "This harbourfront hotel in Toronto City centre features on site dining as well as a rooftop patio", "24 hour", R.drawable.radissonblu));
        hotelArray.add(new Attraction("Fairmont Royal York Hotel", "Boasting a skylit indoor pool and 3 on-site dining options", "24 hour", R.drawable.fairmont));
        hotelArray.add(new Attraction("The Rosemont Residences", "Situated in Toronto, 2.3 km from Hanlans point beach and 500 meteres from Toronto Symphony Orchestra", "12 noon - 14 noon", R.drawable.rosemont));

        AttractionAdapter myAdapter = new AttractionAdapter(getActivity(), hotelArray);
        ListView myListView = (ListView) viewRoot.findViewById(R.id.list_hotels);
        myListView.setAdapter(myAdapter);

        return viewRoot;
    }
}