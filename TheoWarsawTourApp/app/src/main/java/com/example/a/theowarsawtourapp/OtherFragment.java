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
public class OtherFragment extends Fragment {


    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_view, container, false);

        // Create a list of sights
        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.string.arkadiaName, R.string.arkadiaLoc, R.drawable.arkadia, R.string.arkadiaDesc, true));
        sights.add(new Sight(R.string.galeriaMokotowName, R.string.galeriaMokotowLoc, R.drawable.galeriamokotow, R.string.galeriaMokotowDesc, true));
        sights.add(new Sight(R.string.teatrNarodowyName,R.string.teatrNarodowyLoc,R.drawable.teatrnarodowy,R.string.teatrNarodowyDesc, true));
        sights.add(new Sight(R.string.pomnikMalyName, R.string.pomnikMalyLoc,R.drawable.malypowstaniec, R.string.pomnikMalyDesc, true));
        sights.add(new Sight(R.string.kampinosName, R.string.kampinosLoc, R.drawable.kampinos, R.string.kampinosDesc, true));


        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_other);


        ListView listView = (ListView) rootView.findViewById(R.id.sight_list);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Sight sight = sights.get(position);

                Intent descriptionIntent = new Intent(view.getContext(), DescriptionActivity.class);
                descriptionIntent.putExtra("Image", sight.getSightImage());
                descriptionIntent.putExtra("Desc", sight.getSightDescription());
                startActivityForResult(descriptionIntent, 0);


            }
        });
        return rootView;
    }

}
