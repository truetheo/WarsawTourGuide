package com.example.a.theowarsawtourapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_view, container, false);

        // Create a list of sights
        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.string.palacWilanowName, R.string.palacWilanowLoc, R.drawable.palacwilanow, R.string.palacWilanowDesc, true));
        sights.add(new Sight(R.string.lazienkiKrolewskieName, R.string.lazienkiKrolewskieLoc, R.drawable.palacnawyspie, R.string.lazienkiKrolewskieDesc, true));
        sights.add(new Sight(R.string.stareMiastoName,R.string.stareMiastoLoc,R.drawable.staremiasto,R.string.stareMiastoDesc, true));
        sights.add(new Sight(R.string.zamekKrolewskiName, R.string.zamekKrolewskiLoc,R.drawable.zamkekrolewski, R.string.zamekKrolewskiDesc, true));



        // Create an {@link SightAdapter}, whose data source is a list of {@link Sight}s. The
        // adapter knows how to create list items for each item in the list.
        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // sight_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.sight_list);

        // Make the {@link ListView} use the {@link SightAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Sight} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the clicked list position.
                Sight sight = sights.get(position);
                //create an intent to the Activity
                Intent descriptionIntent = new Intent(view.getContext(), DescriptionActivity.class);
                //Pass the relevant data to inflate the activity.
                descriptionIntent.putExtra("Image", sight.getSightImage());
                descriptionIntent.putExtra("Desc", sight.getSightDescription());
                startActivityForResult(descriptionIntent, 0);


            }
        });
        return rootView;
    }

}
