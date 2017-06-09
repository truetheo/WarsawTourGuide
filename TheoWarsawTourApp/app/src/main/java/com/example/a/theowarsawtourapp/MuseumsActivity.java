package com.example.a.theowarsawtourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by a on 08-Jun-17.
 */

public class MuseumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MuseumsFragment())
                .commit();
    }
}
