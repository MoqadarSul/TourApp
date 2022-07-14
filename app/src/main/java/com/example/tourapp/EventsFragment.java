package com.example.tourapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.activity_events, container, false);
        final ArrayList<Attraction> eventsArray = new ArrayList<>();
        eventsArray.add(new Attraction("Tech Career Fair", "Exclusive tech hiring event-new Tickets available", "12pm - 8pm", R.drawable.tech));
        eventsArray.add(new Attraction("Travel Indoors", "Black Travel Summit Digital Sessions", "1pm -  9pm", R.drawable.travel));
        eventsArray.add(new Attraction("Crews and Tangos Drag show", "Crews and Tangos show Exclusive", "8pm - 12am", R.drawable.crews));
        eventsArray.add(new Attraction("Bathhurts & Eglinton Live Music", "Live Music - Jazz and pop", "7pm - 12am", R.drawable.bathhurts));


        AttractionAdapter myAdapter = new AttractionAdapter(getActivity(), eventsArray);
        ListView myListView = (ListView) viewRoot.findViewById(R.id.list_events);
        myListView.setAdapter(myAdapter);
        return viewRoot;
    }

}