package com.example.a.theowarsawtourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeerPubsFragment extends Fragment {


    public BeerPubsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_view, container, false);


        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.string.elephant, R.string.elephantLoc, R.drawable.elephant, R.string.elephantRat));
        sights.add(new Sight(R.string.chmielarnia, R.string.chmielarniaLoc, R.drawable.chmielarnia, R.string.chmielarniaRat));
        sights.add(new Sight(R.string.cudaNaKiju,R.string.cudaNaKijuLoc,R.drawable.cudanakiju,R.string.cudaNaKijuRat));
        sights.add(new Sight(R.string.PiwPaw, R.string.PiwPawLoc,R.drawable.piwpaw, R.string.PiwPawRat));
        sights.add(new Sight(R.string.Hoppiness, R.string.HoppinessLoc,R.drawable.hoppiness, R.string.HoppinessRat));
        sights.add(new Sight(R.string.SpiwkowcyRzkoszy, R.string.SpiwkowcyRzkoszyLoc,R.drawable.spiwkowcyrozkoszy, R.string.SpiwkowcyRzkoszyRat));

        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_beer);

        ListView listView = (ListView) rootView.findViewById(R.id.sight_list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
