package com.example.tourapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EntertainmentFragment extends Fragment {

    public EntertainmentFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.activity_entertainment, container, false);
        final ArrayList<Attraction> entertainmentArray = new ArrayList<>();
        String [] allTitles = getResources().getStringArray(R.array.entertainmentArrayTitle);
        String [] allDescriptions = getResources().getStringArray(R.array.entertainmentArrayDescription);
        String [] allHours = getResources().getStringArray(R.array.entertainmentArrayHours);
        entertainmentArray.add(new Attraction(allTitles[0], allDescriptions[0], allHours[0], R.drawable.grid));
        entertainmentArray.add(new Attraction(allTitles[1], allDescriptions[1], allHours[1], R.drawable.sword));
        entertainmentArray.add(new Attraction(allTitles[2], allDescriptions[2], allHours[2], R.drawable.endlessfun));
        entertainmentArray.add(new Attraction(allTitles[3], allDescriptions[3], allHours[3], R.drawable.goodtimes));
        AttractionAdapter myAdapter = new AttractionAdapter(getContext(), entertainmentArray);
        ListView myListView = (ListView) viewRoot.findViewById(R.id.list_Entertainment);
        myListView.setAdapter(myAdapter);
        return viewRoot;
    }



}