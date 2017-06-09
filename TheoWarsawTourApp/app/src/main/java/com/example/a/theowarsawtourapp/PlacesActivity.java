package com.example.a.theowarsawtourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new PlacesFragment())
                .commit();
    }
}
