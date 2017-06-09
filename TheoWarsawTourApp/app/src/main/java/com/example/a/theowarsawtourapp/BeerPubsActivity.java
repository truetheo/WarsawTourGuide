package com.example.a.theowarsawtourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeerPubsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Begin the Transation of Activity to the Fragment, wehere the container will be filled with fragment.
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new BeerPubsFragment())
                .commit();
    }
}
