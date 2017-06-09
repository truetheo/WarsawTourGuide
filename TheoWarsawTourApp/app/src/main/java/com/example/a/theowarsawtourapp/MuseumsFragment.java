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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_view, container, false);


        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.string.mNarodoweName, R.string.mNarodoweLoc, R.drawable.mnarodowe, R.string.mNarodoweDesc, true));
        sights.add(new Sight(R.string.centrumNaukiName, R.string.centrumNaukiLoc, R.drawable.mcentrumnaukikopernik, R.string.centrumNaukiDesc, true));
        sights.add(new Sight(R.string.POLINName,R.string.POLINLoc,R.drawable.mhistoriizydowpolskich,R.string.POLINDesc, true));
        sights.add(new Sight(R.string.mPowstaniaWarName, R.string.mPowstaniaWarLoc,R.drawable.mpowstwar, R.string.mPowstaniaDesc, true));




        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_museums);


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
