package com.example.tourapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {


    public AttractionAdapter(@NonNull Context context, ArrayList<Attraction> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View myView = convertView;
        if(myView == null){
            myView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Attraction currAttraction = getItem(position);
        TextView title = (TextView) myView.findViewById(R.id.titleId);
        TextView description = (TextView) myView.findViewById(R.id.descriptionId);
        ImageView imageResource = (ImageView) myView.findViewById(R.id.imageResourceID);
        TextView timing = (TextView) myView.findViewById(R.id.timingId);
        title.setText(currAttraction.getmTitle().toString());
        description.setText(currAttraction.getmDescription().toString());
        imageResource.setImageResource(currAttraction.getmImageResource());
        timing.setText(currAttraction.getmHours().toString());


        return myView;



    }
}
