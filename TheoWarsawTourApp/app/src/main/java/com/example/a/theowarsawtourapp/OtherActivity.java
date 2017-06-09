package com.example.a.theowarsawtourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new OtherFragment())
                .commit();
    }
}
